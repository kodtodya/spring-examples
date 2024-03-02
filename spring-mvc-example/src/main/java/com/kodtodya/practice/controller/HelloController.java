package com.kodtodya.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String display() {
        System.out.println("inside the display()");
        return "index";
    }
}
