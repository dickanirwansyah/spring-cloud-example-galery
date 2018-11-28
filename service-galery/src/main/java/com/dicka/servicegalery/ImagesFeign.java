package com.dicka.servicegalery;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "service-images")
public interface ImagesFeign {

    @GetMapping(value = "/images")
    List<Galery> listGalery();


}
