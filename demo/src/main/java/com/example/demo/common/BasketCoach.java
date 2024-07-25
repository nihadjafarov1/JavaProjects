package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach{

    public BasketCoach() {
        System.out.println("Class name is : " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Just do it";
    }


}
