package com.shangwj.blog.mapper;

import com.shangwj.blog.model.Sys_user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface Sys_userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sys_user record);

    int insertSelective(Sys_user record);

    Sys_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sys_user record);

    int updateByPrimaryKey(Sys_user record);

    Sys_user getAllUserInfo();
}