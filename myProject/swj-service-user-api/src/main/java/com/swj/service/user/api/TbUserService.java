package com.swj.service.user.api;

import com.swj.commons.domain.SysUser;

import java.util.List;
import java.util.Map;

public interface TbUserService {
    List<SysUser> selectAll();

    Map<String,Object> getList();
}
