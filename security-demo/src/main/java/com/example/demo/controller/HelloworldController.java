package com.example.demo.controller;


import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class HelloworldController {

    @Autowired
    public UserService userService;

    @GetMapping("/age")
    public ResponseEntity getAge(){
        return new ResponseEntity(userService.getAge(), HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity getName(){
        return new ResponseEntity(userService.getUserName(), HttpStatus.OK);
    }
}