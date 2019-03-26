package com.shangwj.blog.service.impl;

import com.shangwj.blog.mapper.SysUserMapper;
import com.shangwj.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.*;


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
        Map<Object,Object> map=new HashMap<Object,Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");
        stringRedisTemplate.opsForHash().putAll("map2",map);
        Map<Object,Object> resultMap= stringRedisTemplate.opsForHash().entries("map2");
        List<Object> reslutMapList=stringRedisTemplate.opsForHash().values("map2");
        Set<Object> resultMapSet=stringRedisTemplate.opsForHash().keys("map2");
        String value=(String)stringRedisTemplate.opsForHash().get("map2","key1");
        System.out.println("value:"+value);
        System.out.println("resultMapSet:"+resultMapSet);
        System.out.println("resultMap:"+resultMap);
        System.out.println("resulreslutMapListtMap:"+reslutMapList);

    }

    @Override
    public void operaRedisList() throws Exception {
//        List<String> list1=new ArrayList<String>();
//        list1.add("a1");
//        list1.add("a2");
//        list1.add("a3");
//
//        List<String> list2=new ArrayList<String>();
//        list2.add("b1");
//        list2.add("b2");
//        list2.add("b3");
//        redisTemplate.opsForList().leftPush("listkey1",list1);
//        redisTemplate.opsForList().rightPush("listkey2",list2);
//        List<String> resultList1=(List<String>)redisTemplate.opsForList().leftPop("listkey1");
//        List<String> resultList2=(List<String>)redisTemplate.opsForList().rightPop("listkey2");
//        System.out.println("resultList1:"+resultList1);
//        System.out.println("resultList2:"+resultList2);

        List<String> resultList1=stringRedisTemplate.opsForList().range("list1",0,-1);
        System.out.println("192310");
        for (String object : resultList1) {
            System.out.println(object);//c b a
        }


    }


}
