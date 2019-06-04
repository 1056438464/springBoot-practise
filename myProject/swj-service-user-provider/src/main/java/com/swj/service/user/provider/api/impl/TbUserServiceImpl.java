package com.swj.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.swj.commons.domain.SysUser;
import com.swj.commons.mapper.SysUserMapper;
import com.swj.service.user.provider.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(version = "${services.versions.user.v1}")
@Transactional(readOnly = true)
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> selectAll() {
        return sysUserMapper.selectAll();
    }
}
