package com.dicka.servicegalery;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GaleryController {

	@Autowired
	private Environment environment;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ImagesFeign imagesFeign;
	
	/** example return port **/
	@GetMapping(value = "/")
	public String getHelloMyPort(){
		return "hello from locaport : "+environment.getProperty("local.server.port")+" !";
	}

	/** using rest template **/
	@GetMapping(value = "/galery",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Galery>> getGaleryRest(){
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<List<Galery>> entity = new HttpEntity<>(httpHeaders);


		return ResponseEntity.ok(
				restTemplate.exchange("http://service-images/images",
						HttpMethod.GET, entity, List.class)
						.getBody());
	}

	/** using feign client **/
	@GetMapping(value = "/galery-feign")
	public ResponseEntity<List<Galery>> getGaleryFeign(){
		return ResponseEntity.ok(
			imagesFeign.listGalery());
	}
}
