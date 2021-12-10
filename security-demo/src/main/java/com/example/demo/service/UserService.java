package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {


    public String getUserName() {
        return "Michael";
    }

    public Integer getAge() {
        return 28;
    }
}