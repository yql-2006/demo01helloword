package com.wzx.demo01helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test01Controller{
    @GetMapping("/test01name")
    public  String test01name(){
        return "Hello Word";
    }
}