package com.shangwj.blog.controller;

import com.shangwj.blog.model.Sys_user;
import com.shangwj.blog.service.SysUserService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.awt.SystemColor.info;


@RestController
@RequestMapping(value = "/myblog")
public class UserController {

    @Resource
    private SysUserService sysUserService;



    JSONObject object = new JSONObject();

    @RequestMapping(value = "/getUserInfo")
    public Object getUserInfo() {
        Sys_user info = new Sys_user();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.put("message", "aaa");
    }


//    @RequestMapping(value = "/operaRedis")
//    public Object operaRedis() {
//
//        try {
//            redisTemplate.opsForSet().add("usr","name","swj");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return object.put("message", "successful");
//    }
}
