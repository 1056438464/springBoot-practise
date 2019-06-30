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
import java.util.Map;

@Service(version = "${services.versions.user.v1}",timeout = 3000)
@Transactional(readOnly = true)
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectAll() {
        return sysUserMapper.selectAll();
    }

    @Override
    public Map LoginUser(Map param) {
        return sysUserMapper.LoginUser(param);
    }

//    @Override
//    public PageInfo<TbUser> page(int pageNum, int pageSize, TbUser tbUser) {
//        String username = tbUser.getUsername();
//        String phone = tbUser.getPhone();
//        String email = tbUser.getEmail();
//
//        Example example = new Example(TbUser.class);
//        example.createCriteria()
//                .andLike("username", username != null ? username + "%" : null)
//                .andLike("phone", phone != null ? phone + "%" : null)
//                .andLike("email", email != null ? email + "%" : null);
//
//        PageHelper.offsetPage(pageNum, pageSize);
//        PageInfo<TbUser> pageInfo = new PageInfo<>(tbUserMapper.selectByExample(example));
//        return pageInfo;
//    }
}
