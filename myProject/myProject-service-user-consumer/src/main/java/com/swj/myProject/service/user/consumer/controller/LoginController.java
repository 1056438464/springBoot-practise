package com.swj.myProject.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.swj.myProject.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class LoginController
{
    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, String account, String password)
    {
        User user = userService.findUserByAccountAndPassword(account, password);
        if (user != null)
        {
            HttpSession session = request.getSession();
            session.setAttribute("loginUserId", user.getUserId());
            redisTemplate.opsForValue().set("loginUser:" + user.getUserId(), session.getId());

            return  "登录成功！";
        }
        else
        {
            return  "账户名或密码错误！";
        }
    }

    @RequestMapping(value = "/getUserInfo")
    public String get(long userId)
    {
        List user = tbUserService.selectAll();
        if (user != null)
        {
            return  "查询成功！";
        }
        else
        {
            return  "用户不存在！";
        }
    }
}
