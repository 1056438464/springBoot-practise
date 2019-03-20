package com.shangwj.blog.service.impl;

import com.shangwj.blog.mapper.Sys_userMapper;
import com.shangwj.blog.model.Sys_user;
import com.shangwj.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class SysUserServiceImp implements SysUserService {

    @Resource
    private Sys_userMapper sys_userMapper;

    @Override
    public Sys_user getAllUserInfo() throws Exception {
        return sys_userMapper.getAllUserInfo();
    }
}
