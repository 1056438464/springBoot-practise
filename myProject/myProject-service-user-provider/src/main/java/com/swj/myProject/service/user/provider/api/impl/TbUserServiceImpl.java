package com.swj.myProject.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.swj.myProject.commons.domain.SysUser;
import com.swj.myProject.commons.domain.TbUser;
import com.swj.myProject.commons.mapper.SysUserMapper;
import com.swj.myProject.commons.mapper.TbUserMapper;
//import com.funtl.myshop.service.redis.api.RedisService;
import com.swj.myProject.service.user.api.TbUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service(version = "${services.versions.user.v1}",timeout = 3000)
@Transactional(readOnly = true)
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectAll() {
        return sysUserMapper.selectAll();
    }

}
