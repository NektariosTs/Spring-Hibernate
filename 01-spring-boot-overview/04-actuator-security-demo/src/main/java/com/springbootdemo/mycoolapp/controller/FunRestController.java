package com.springbootdemo.mycoolapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }

    //expose new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkOut() {
        return "Run a jard 5km!";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}
