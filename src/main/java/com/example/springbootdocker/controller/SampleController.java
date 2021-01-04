package com.example.springbootdocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @GetMapping(value="/hello")
    public String helloWorld(){
        return "Hello World - Spring boot app running on docker container";
    }
}
