package com.zh.springbootdemo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController //Controller + responseController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String getHello(){
        return "Hello World.";
    }

    @RequestMapping("")
    public String info(){
        return "Info";
    }

    @RequestMapping("Time")
    public String getTime(String time){
        switch(time){
            case "time":
                // http://127.0.0.1:8080/Time?time=time
                SimpleDateFormat tFormat = new SimpleDateFormat("HH:mm:ss");
                return "当前时间为： " + tFormat.format(new Date());
            case "date":
                // http://127.0.0.1:8080/Time?time=date
                SimpleDateFormat dFormat = new SimpleDateFormat("yy-MM-dd");
                return "当前日期为： " + dFormat.format(new Date());
                default:
                    return "";
        }
    }

}
