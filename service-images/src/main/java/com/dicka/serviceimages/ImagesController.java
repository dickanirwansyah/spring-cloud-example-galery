package com.dicka.serviceimages;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/images")
public class ImagesController {

	private Environment environment;
	
	@GetMapping
	public ResponseEntity<List<Images>> getListImages(){
		List<Images> images = new ArrayList<Images>();
		images.add(new Images(1, "example image 1", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"));
		images.add(new Images(2, "example image 2", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"));
		images.add(new Images(3, "example image 3", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
		return new ResponseEntity<List<Images>>(images, HttpStatus.OK);
	}
}
