package com.akmalkhamidov.spring.geometryFigures_api;

import com.akmalkhamidov.spring.geometryFigures_api.entity.GeometryFigure;
import com.akmalkhamidov.spring.geometryFigures_api.exception_handling.NoSuchFigureException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GeometryFiguresApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeometryFiguresApiApplication.class, args);
    }


    // Post mapping is used to make an input (requestMapping)
    // I was testing by using Postman
    @PostMapping("/")
    public @ResponseBody GeometryFigure requestGeometryFigure(@RequestBody GeometryFigure geometryFigure){
        if(geometryFigure.isValidFigure()){
            geometryFigure.findArea();
            geometryFigure.findPerimeter();
        } else throw new NoSuchFigureException("Given geometry figure is invalid.");

        return geometryFigure;
    }

}
