package com.swj.myProject.service.user.api;

import com.swj.myProject.commons.domain.SysUser;
import com.swj.myProject.commons.domain.TbUser;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TbUserService {
    /**
     * 查询全部数据
     * @return
     */
    List<SysUser> selectAll();

    /**
     * 查询分页数据
     * @param pageNum 页码
     * @param pageSize 笔数
     * @param tbUser 查询参数
     * @return
     */
//    PageInfo<TbUser> page(int pageNum, int pageSize, TbUser tbUser);
}
