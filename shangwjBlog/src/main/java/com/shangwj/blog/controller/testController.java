package com.shangwj.blog.controller;

import com.shangwj.blog.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "test")
public class testController {


    @Autowired
    public RedisTemplate<Object,Object> redisTemplate;

    @Resource(name="userService")
    private userService userservice;

    @RequestMapping(value = "/test1")
    public String getTest(){
        return "sssss";
    }

    @RequestMapping(value = "/restfull/{id}")
    public Integer testRestFull(@PathVariable("id") Integer id){

        return id;
    }
    @RequestMapping("/redis")
    public String findRedis() {

        return userservice.findRedis();

    }
}
