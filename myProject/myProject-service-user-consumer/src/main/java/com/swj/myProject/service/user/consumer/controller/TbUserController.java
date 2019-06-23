package com.swj.myProject.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.swj.myProject.commons.domain.SysUser;
import com.swj.myProject.service.user.api.TbUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class TbUserController {

    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserService;

    /**
     * 跳转到列表页
     *
     * @return
     */
    @RequestMapping(value = "list")
    public List<SysUser> list() {
        return tbUserService.selectAll();
    }

    @RequestMapping(value = "list1")
    public String list1() {
        return "11111";
    }

}
