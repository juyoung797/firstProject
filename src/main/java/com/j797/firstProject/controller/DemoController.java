package com.j797.firstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/hello")
    public String hello() {
        return "hello"; // hello.html 파일로 맵핑
    }
}
