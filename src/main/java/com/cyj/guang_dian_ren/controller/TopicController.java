package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.Topic;
import com.cyj.guang_dian_ren.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
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

    @PostMapping("/save")
    public void save(@RequestBody Map<String, Object> para) {
        Integer topicId = (Integer) para.get("topicId");
        String username = (String) para.get("username");
        String title = (String) para.get("title");
        String date = (String) para.get("date");
        Topic topic = new Topic(topicId, title, username, date);
        topic.setTopicId(topicId);
        topic.setTitle(title);
        topic.setUsername(username);
        topic.setDate(date);
        iTopicService.save(topic);
    }
}
