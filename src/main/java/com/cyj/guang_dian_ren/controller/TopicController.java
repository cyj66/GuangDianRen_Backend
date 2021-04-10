package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.Topic;
import com.cyj.guang_dian_ren.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
@RestController
@RequestMapping("/topic")
public class TopicController {
    @Autowired
    ITopicService iTopicService;
    @GetMapping("/list")
    public List<Topic> list() {
        return iTopicService.list();
    }
}
