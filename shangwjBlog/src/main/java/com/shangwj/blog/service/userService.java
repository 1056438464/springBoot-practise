package com.shangwj.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

@Service("userService")
public class userService {
    @Autowired
    private JedisCluster jedisCluster;



    public String findRedis() {

        jedisCluster.set("userName", "hello wenqy");

        return jedisCluster.get("userName");

    }
}
