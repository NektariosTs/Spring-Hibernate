package com.nekta.springcoredemo.common;

import org.springframework.stereotype.Component;


//we cant use more than one primary cause we will have problem. we can use only one primary
//and the qualifier annotation is always first than primary
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!!";
    }
}
