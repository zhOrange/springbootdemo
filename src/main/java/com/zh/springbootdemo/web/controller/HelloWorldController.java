package com.zh.springbootdemo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //COntroller + responseController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String getHello(){
        return "Hello World.";
    }

    @RequestMapping("")
    public String info(){
        return "Info";
    }

}
