package com.swj.myProject.service.user.api;

import com.swj.myProject.commons.domain.SysUser;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TbUserService {
    /**
     * 查询全部数据
     * @return
     */
    List<SysUser> selectAll();

    SysUser selectByCondition(Object condition);
}
