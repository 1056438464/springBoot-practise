package com.shangwj.blog.mapper;

import com.shangwj.blog.model.Sysuser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

public interface SysUserMapper {


    List<Map<String,Object>> getAllUserInfo();
}