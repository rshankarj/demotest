package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequestMapping("/employee")
public class FirstController {

    @GetMapping ("/message")
    public String sayHello(){
        return "<h2>From Microservice One</h2>";
    }
}
