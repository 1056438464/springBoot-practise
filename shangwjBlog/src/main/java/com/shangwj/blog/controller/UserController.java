package com.shangwj.blog.controller;

import com.shangwj.blog.model.Sysuser;
import com.shangwj.blog.service.SysUserService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.awt.SystemColor.info;


@RestController
@RequestMapping(value = "/myblog")
public class UserController {

    @Resource
    private SysUserService sysUserService;




    JSONObject object = new JSONObject();


    @RequestMapping(value = "/getUserInfo")
    public String getUserInfo() {
        List<Map<String,Object>> info = new ArrayList<>();

        try {
            info = sysUserService.getAllUserInfo();
            object.put("message", info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.toString();
    }


    @RequestMapping(value = "/operaRedis")
    public Object operaRedis() {

        try {
            sysUserService.operaRedisSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.put("message", "successful");
    }

    @RequestMapping(value = "/operaRedisInteger")
    public Object operaRedisInteger() {

        try {
            sysUserService.operaRedisSetInteger();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.put("message", "successful");
    }

    @RequestMapping(value = "/operaRedisHash")
    public Object operaRedisHash() {

        try {
            sysUserService.operaRedisHash();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.put("message", "successful");
    }


    @RequestMapping(value = "/operaRedisList")
    public Object operaRedisList() {

        try {
            sysUserService.operaRedisList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.put("message", "successful");
    }
}
