package com.swj.dubboserviceuserconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.swj.dubbo.service.user.api.userService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {

    @Reference(version = "1.0.0")
    private userService  userservice;

    @RequestMapping(value = "hi")
    public String test(){
        return userservice.sayHi();
    }
}
