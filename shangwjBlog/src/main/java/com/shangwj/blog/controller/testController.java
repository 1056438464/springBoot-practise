package com.shangwj.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class testController {

    @Autowired
    public RedisTemplate<Object,Object> redisTemplate;
    @RequestMapping(value = "/test1")
    public String getTest(){
        return "sssss";
    }
}
