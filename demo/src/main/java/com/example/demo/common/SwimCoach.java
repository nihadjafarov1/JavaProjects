package com.example.demo.common;

public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("Class name is : " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as a warm up!";
    }
}
