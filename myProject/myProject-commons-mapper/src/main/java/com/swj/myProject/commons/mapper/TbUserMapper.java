package com.swj.myProject.commons.mapper;

import com.swj.myProject.commons.domain.TbUser;
import com.swj.myProject.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends MyMapper<TbUser> {
}