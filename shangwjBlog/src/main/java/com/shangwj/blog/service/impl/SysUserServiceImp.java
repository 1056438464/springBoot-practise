package com.shangwj.blog.service.impl;

import com.shangwj.blog.mapper.SysUserMapper;
import com.shangwj.blog.model.Sysuser;
import com.shangwj.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Service
public class SysUserServiceImp implements SysUserService {

    @Autowired
    private SysUserMapper sys_userMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public List<Map<String,Object>> getAllUserInfo() throws Exception {
        return sys_userMapper.getAllUserInfo();
    }

    @Override
    public void operaRedis() throws Exception {
        SetOperations<Object, Object> set = redisTemplate.opsForSet();
        set.add("set1","22");
        Set<Object> resultSet =redisTemplate.opsForSet().members("set1");
        System.out.println("resultSet:"+resultSet);
    }


}
