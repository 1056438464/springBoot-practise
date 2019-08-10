package com.shangwj.blog.mapper;

import com.shangwj.blog.model.Menu;

import java.util.List;
import java.util.Map;

public interface MenuMapper {
    List<Menu> findAllRecursion(Integer id);
}