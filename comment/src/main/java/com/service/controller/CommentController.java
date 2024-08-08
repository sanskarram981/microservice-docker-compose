package com.service.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CommentController {

    @GetMapping("/comment")
    public ResponseEntity<?> getComment(){
        return new ResponseEntity<>("Hello from inside of the comment microservice", HttpStatus.OK);
    }
}
