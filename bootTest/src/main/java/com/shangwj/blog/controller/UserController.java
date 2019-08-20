package com.shangwj.blog.controller;

import com.shangwj.blog.mapper.MenuMapper;
import com.shangwj.blog.model.Menu;
import com.shangwj.blog.model.MenuMap;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Resource
    private MenuMapper menuMapper;

    JSONObject object = new JSONObject();

    @RequestMapping(value = "/getUserInfo")
    public String getUserInfo() {
        List<Menu> info = new ArrayList<>();

        try {
            info = menuMapper.findAllRecursion(0);
            object.put("message", info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.toString();
    }

    /**
     * 递归查询
     * @return
     */
    @RequestMapping(value = "/getUserInfoOther1")
    public String getUserInfoOther1() {
        List<Menu> info = new ArrayList<>();

        try {
            info = menuMapper.findAllRecursionOther1();
            object.put("message", info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.toString();
    }

    /**
     * 一对一查询
     * @return
     */
    @RequestMapping(value = "/getAllInfo")
    public String getAllInfo() {
        List<MenuMap> info = new ArrayList<>();
        try {
             info = menuMapper.getAllInfo();
            object.put("message", info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.toString();
    }

    /**
     * 传入不同参数或多个参数
     * @return
     */
    @RequestMapping(value = "/gettwoParam")
    public String gettwoParam() {

        try {
            List<Map> list = new ArrayList<>();
            Map<String,Object> map1 = new HashMap<String, Object>();
            map1.put("num",1);
            Map<String,Object> map2 = new HashMap<String, Object>();
            map2.put("num",2);
            Map<String,Object> map3 = new HashMap<String, Object>();
            map3.put("num",3);
            list.add(map1);
            list.add(map2);
            list.add(map3);
             Map<String,Object> info = menuMapper.gettwoParam(list,1);
            object.put("message", info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.toString();
    }

}
