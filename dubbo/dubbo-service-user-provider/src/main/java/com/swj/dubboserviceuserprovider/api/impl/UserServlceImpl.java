package com.swj.dubboserviceuserprovider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.swj.dubbo.service.user.api.userService;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class UserServlceImpl implements userService {

    @Value("${dubbo.protocol.port}")
    private String post;
    @Override
    public String sayHi() {
        return "hello dubbo post is"+post;
    }
}
