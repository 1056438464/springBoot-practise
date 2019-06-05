package com.swj.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.swj.service.user.provider.api.TbUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Reference
    private TbUserService tbUserSerxvice;

    @RequestMapping(value = "list")
    public List getUserList() throws Exception{

        return tbUserSerxvice.selectAll();
    }


}
