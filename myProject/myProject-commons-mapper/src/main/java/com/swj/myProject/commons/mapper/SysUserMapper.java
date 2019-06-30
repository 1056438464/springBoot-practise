package com.swj.myProject.commons.mapper;

import com.swj.myProject.commons.domain.SysUser;
import com.swj.myProject.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

import java.util.Map;

@CacheNamespace(implementation = RedisCache.class)
public interface SysUserMapper extends MyMapper<SysUser> {
    Map LoginUser(Map param);
}