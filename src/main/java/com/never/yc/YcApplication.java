package com.never.yc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@RequestMapping("/api/home")
public class YcApplication {

    public static void main(String[] args) {
        SpringApplication.run(YcApplication.class, args);
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        return "Hello ：" + name + " welcome to family ";
    }


    @RequestMapping("/test")
    @ResponseBody
    public String deploy(String name) {
        return "Hello ：test for jenkins deploy ";
    }

}
