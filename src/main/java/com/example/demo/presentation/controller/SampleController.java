package com.example.demo.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SampleController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
	
}
