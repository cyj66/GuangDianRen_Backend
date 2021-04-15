package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.TopicLike;
import com.cyj.guang_dian_ren.service.ITopicLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
@RequestMapping("/topic-like")
public class TopicLikeController {
    @Autowired
    ITopicLikeService iTopicLikeService;
    @GetMapping("/list")
    public List<TopicLike> list() {
        return iTopicLikeService.list();
    }

    @PostMapping("/save")
    public void save(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer topicId= (Integer) para.get("topicId");
        String date=(String)para.get("date");
        TopicLike topicLike = new TopicLike(topicId,username,date);
        topicLike.setUsername(username);
        topicLike.setTopicId(topicId);
        topicLike.setDate(date);
        iTopicLikeService.save(topicLike);
    }

    @DeleteMapping("/remove")
    public void remove(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer topicId= (Integer) para.get("topicId");
        Map<String,Object> removeTopicLike = new HashMap<>();
        removeTopicLike.put("username", username);
        //注意不是“TopicId”,要和数据表字段名保持一致
        removeTopicLike.put("topic_id", topicId);
        iTopicLikeService.removeByMap(removeTopicLike);
    }
}
