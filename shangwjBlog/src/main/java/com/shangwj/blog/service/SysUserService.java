package com.shangwj.blog.service;


import com.shangwj.blog.model.Sysuser;

import java.util.List;
import java.util.Map;

public interface SysUserService {

   List<Map<String,Object>> getAllUserInfo() throws Exception;

   void operaRedisSet() throws Exception;

   void operaRedisSetInteger() throws Exception;

   void operaRedisHash() throws  Exception;

}
