package com.swj.myProject.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.swj.myProject.commons.domain.SysUser;
import com.swj.myProject.service.user.api.TbUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class TbUserController {

    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserService;

    /**
     * 跳转到列表页
     *
     * @return
     */
    @RequestMapping(value = "list")
    public List<SysUser> list() {
        return tbUserService.selectAll();
    }

//    @ResponseBody
//    @RequestMapping(value = "page", method = RequestMethod.GET)
//    public DataTableDTO<TbUser> page(HttpServletRequest request, TbUser tbUser) {
//        String strDraw = request.getParameter("draw");
//        String strStart = request.getParameter("start");
//        String strLength = request.getParameter("length");
//
//        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
//        int start = strStart == null ? 0 : Integer.parseInt(strStart);
//        int length = strLength == null ? 10 : Integer.parseInt(strLength);
//
//        // 封装 Datatables 需要的结果
//        PageInfo<TbUser> pageInfo = tbUserService.page(start, length, tbUser);
//        DataTableDTO<TbUser> dataTableDTO = new DataTableDTO<>();
//        dataTableDTO.setData(pageInfo.getList());
//        dataTableDTO.setDraw(draw);
//        dataTableDTO.setRecordsTotal(pageInfo.getTotal());
//        dataTableDTO.setRecordsFiltered(pageInfo.getTotal());
//
//        return dataTableDTO;
//    }
}
