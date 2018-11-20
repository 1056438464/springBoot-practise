package com.shangwj.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class testController {

    @RequestMapping(value = "/test1")
    public String getTest(){
        return "sssss";
    }
}
