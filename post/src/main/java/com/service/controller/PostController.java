package com.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PostController {
    @GetMapping("/post")
    public ResponseEntity<?> getPost(){
        return new ResponseEntity<>("Hello from inside of the post microservice", HttpStatus.OK);
    }
}
