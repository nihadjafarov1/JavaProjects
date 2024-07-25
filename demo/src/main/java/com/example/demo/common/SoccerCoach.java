package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

    public SoccerCoach() {
        System.out.println("Class name is : " + this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run 5k for a day of time";
    }
}
