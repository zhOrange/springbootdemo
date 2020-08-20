package com.zh.springbootdemo.web.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@RestController //Controller + responseController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String getHello(){
        return "Hello World.";
    }

    @RequestMapping("")
    public String info(){
        return "Infomation";
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
