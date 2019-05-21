package com.swj.dubboserviceuserprovider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.swj.dubbo.service.user.api.userService;

@Service(version = "1.0.0")
public class UserServlceImpl implements userService {
    @Override
    public String sayHi() {
        return "hello dubbo";
    }
}
