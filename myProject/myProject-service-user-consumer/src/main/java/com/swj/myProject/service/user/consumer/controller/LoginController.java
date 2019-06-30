package com.swj.myProject.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.swj.myProject.commons.domain.SysUser;
import com.swj.myProject.service.redis.api.RedisService;

import com.swj.myProject.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/user")
public class LoginController
{
//    @Reference(version = "${services.versions.user.v1}")
//    private TbUserService tbUserService;
//
//    @Reference
//    private RedisService redisService;
//
//    @RequestMapping("/login")
//    public String login(HttpServletRequest request, String account, String password)
//    {
//        Map param = new HashMap() ;
//        param.put("username",account);
//        param.put("password",password);
//
//        SysUser user = tbUserService.selectByCondition(param);
//        if (user != null)
//        {
//            HttpSession session = request.getSession();
//            session.setAttribute("loginUserId", user.getId());
//            redisService.set("loginUser:" + user.getId(), session.getId());
//
//            return  "登录成功！";
//        }
//        else
//        {
//            return  "账户名或密码错误！";
//        }
//    }
//
//    @RequestMapping(value = "/getUserInfo")
//    public String get(long userId)
//    {
//        List user = tbUserService.selectAll();
//        if (user != null)
//        {
//            return  "查询成功！";
//        }
//        else
//        {
//            return  "用户不存在！";
//        }
//    }
}
