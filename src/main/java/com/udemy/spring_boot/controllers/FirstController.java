package com.udemy.spring_boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(path = "content")
    public String test() {
        return "I'm just testing!";
    }
}
