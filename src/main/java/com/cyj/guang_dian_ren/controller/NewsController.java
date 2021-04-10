package com.cyj.guang_dian_ren.controller;

import com.cyj.guang_dian_ren.entity.News;
import com.cyj.guang_dian_ren.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    INewsService iNewsService;

    @GetMapping("/list")
    public List<News> list() {
        //lambda表达式，也可称为闭包，允许把函数作为一个方法的参数（函数作为参数传递进方法中）
        return iNewsService.list();
    }
}
