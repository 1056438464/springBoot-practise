package com.swj.commons.mapper;

import com.swj.commons.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.MyMapper;

import java.util.Map;


public interface SysUserMapper extends MyMapper<SysUser> {
    Map<String,Object> getList();
}