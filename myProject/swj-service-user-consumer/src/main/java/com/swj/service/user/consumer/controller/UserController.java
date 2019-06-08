package com.swj.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.swj.service.user.api.TbUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserSerxvice;

    @RequestMapping(value = "list")
    public Map<String, Object> getUserList() throws Exception{

        return tbUserSerxvice.getList();
    }

    @RequestMapping(value = "list1")
    public String getUserList1() throws Exception{

        return "1111231";
    }



}
