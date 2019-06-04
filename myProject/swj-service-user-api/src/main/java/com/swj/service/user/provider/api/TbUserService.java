package com.swj.service.user.provider.api;

import com.swj.commons.domain.SysUser;

import java.util.List;

public interface TbUserService {
    List<SysUser> selectAll();
}
