package com.springbootdemo.mycoolapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }
}
