package com.shangwj.blog.mapper;

import com.shangwj.blog.model.Menu;
import com.shangwj.blog.model.MenuMap;

import java.util.List;
import java.util.Map;

public interface MenuMapper {
    List<Menu> findAllRecursion(Integer id);

    List<Menu> findAllRecursionOther1();

    List<MenuMap> getAllInfo();
}