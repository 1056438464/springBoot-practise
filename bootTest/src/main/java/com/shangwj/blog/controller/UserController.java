package com.shangwj.blog.controller;

import com.shangwj.blog.mapper.impl.MenuMapper;
import com.shangwj.blog.model.Menu;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Autowired
    private MenuMapper menuMapper;

    JSONObject object = new JSONObject();

    @RequestMapping(value = "/getUserInfo")
    public String getUserInfo() {
        List<Menu> info = new ArrayList<>();

        try {
            info = menuMapper.findAllRecursion();
            object.put("message", info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.toString();
    }

}
