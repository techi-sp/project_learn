package org.springlearnproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springlearnproject.org.springlearnproject.services.SampleService;

@Controller
public class SpringLearnController {

    @Autowired
    private SampleService sampleService;

    @GetMapping(path = "/hello")
    public ResponseEntity<String> helloController(){
        String msessage = sampleService.getSentence();
        return new ResponseEntity<String>(msessage, HttpStatus.OK);
    }
}
