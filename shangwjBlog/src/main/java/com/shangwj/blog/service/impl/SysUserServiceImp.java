package com.shangwj.blog.service.impl;

import com.shangwj.blog.mapper.SysUserMapper;
import com.shangwj.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Service
public class SysUserServiceImp implements SysUserService {

    @Autowired
    private SysUserMapper sys_userMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private  RedisTemplate redisTemplate;

    @Override
    public List<Map<String,Object>> getAllUserInfo() throws Exception {
        return sys_userMapper.getAllUserInfo();
    }

    @Override
    public void operaRedisSet() throws Exception {
        SetOperations<String, String> set = stringRedisTemplate.opsForSet();
        set.add("set1","22");
        Set<String> resultSet =stringRedisTemplate.opsForSet().members("set1");
        System.out.println("resultSet:"+resultSet);
    }

    @Override
    public void operaRedisSetInteger() throws Exception {
        SetOperations<Object,Object> set = redisTemplate.opsForSet();
        set.add("age3","six");
        Set<Object> resultSet =redisTemplate.opsForSet().members("age3");
        System.out.println("resultSet:"+resultSet);
    }

    @Override
    public void operaRedisHash() throws Exception {
        Map<String,String> map=new HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");
        redisTemplate.opsForHash().putAll("map1",map);
        Map<String,String> resultMap= redisTemplate.opsForHash().entries("map1");
        List<String>reslutMapList=redisTemplate.opsForHash().values("map1");
        Set<String>resultMapSet=redisTemplate.opsForHash().keys("map1");
        String value=(String)redisTemplate.opsForHash().get("map1","key1");
        System.out.println("value:"+value);
        System.out.println("resultMapSet:"+resultMapSet);
        System.out.println("resultMap:"+resultMap);
        System.out.println("resulreslutMapListtMap:"+reslutMapList);

    }


}
