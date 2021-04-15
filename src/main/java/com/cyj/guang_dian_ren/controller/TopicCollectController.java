package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.TopicCollect;
import com.cyj.guang_dian_ren.service.ITopicCollectService;
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
@RequestMapping("/topic-collect")
public class TopicCollectController {
    @Autowired
    ITopicCollectService iTopicCollectService;
    @GetMapping("/list")
    public List<TopicCollect> list() {
        return iTopicCollectService.list();
    }

    @PostMapping("/save")
    public void save(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer topicId= (Integer) para.get("topicId");
        TopicCollect topicCollect = new TopicCollect(topicId,username);
        topicCollect.setUsername(username);
        topicCollect.setTopicId(topicId);
        iTopicCollectService.save(topicCollect);
    }

    @DeleteMapping("/remove")
    public void remove(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer topicId= (Integer) para.get("topicId");
        Map<String,Object> removeTopicCollect = new HashMap<>();
        removeTopicCollect.put("username", username);
        //注意不是“topicId”,要和数据表字段名保持一致
        removeTopicCollect.put("topic_id", topicId);
        iTopicCollectService.removeByMap(removeTopicCollect);
    }
}
