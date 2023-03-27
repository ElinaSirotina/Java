package com.andersenlab.rmtbanking.creditservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {
    @GetMapping("/hello")
    public String getHelloPage(){
        return "Hello";
    }

}
