package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    
    @RequestMapping(value = "/")
    public String test() {
        return "Hello world and change jf any change in it";
    }
}
