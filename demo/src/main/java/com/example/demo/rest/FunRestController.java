package com.example.demo.rest;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/hy")
    public String hi() {
        return "Hello";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach Name: " + coachName + ", Team Name: " + teamName;
    }
}
