package com.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/coach")
    public String getCoachName(){
        return  "Coach: " +coachName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hi there "+coachName;
    }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day...";
    }

}
