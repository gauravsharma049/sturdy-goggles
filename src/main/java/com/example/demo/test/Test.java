package com.example.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    
    @RequestMapping(value = "/")
    public String test() {
        return "Hello world! I have deployed my first Spring Boot application through github actions!";
    }
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to my first Spring Boot application!";
    }
    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }
}
