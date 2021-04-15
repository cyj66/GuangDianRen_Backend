package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.Answer;
import com.cyj.guang_dian_ren.service.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
@RestController
@RequestMapping("/answer")
public class AnswerController {
    @Autowired
    IAnswerService iAnswerService;
    @GetMapping("/list")
    public List<Answer> list() {
        return iAnswerService.list();
    }

    @PostMapping("/save")
    public void save(@RequestBody Map<String, Object> para) {
        Integer answerId = (Integer) para.get("answerId");
        Integer topicId = (Integer) para.get("topicId");
        String username = (String) para.get("username");
        String content = (String) para.get("content");
        String date = (String) para.get("date");
        Answer answer = new Answer(answerId, content, username,topicId,date);
        answer.setAnswerId(answerId);
        answer.setTopicId(topicId);
        answer.setContent(content);
        answer.setUsername(username);
        answer.setDate(date);
        iAnswerService.save(answer);
    }
}
