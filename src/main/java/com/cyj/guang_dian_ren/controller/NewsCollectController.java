package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.NewsCollect;
import com.cyj.guang_dian_ren.entity.NewsCollect;
import com.cyj.guang_dian_ren.service.INewsCollectService;
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
@RequestMapping("/news-collect")
public class NewsCollectController {
    @Autowired
    INewsCollectService iNewsCollectService;
    @GetMapping("/list")
    public List<NewsCollect> list() {
        return iNewsCollectService.list();
    }

    @PostMapping("/save")
    public void save(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer newsId= (Integer) para.get("newsId");
        NewsCollect newsCollect = new NewsCollect(newsId,username);
        newsCollect.setUsername(username);
        newsCollect.setNewsId(newsId);
        iNewsCollectService.save(newsCollect);
    }

    @DeleteMapping("/remove")
    public void remove(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer newsId= (Integer) para.get("newsId");
        Map<String,Object> removeNewsCollect = new HashMap<>();
        removeNewsCollect.put("username", username);
        //注意不是“newsId”,要和数据表字段名保持一致
        removeNewsCollect.put("news_id", newsId);
        iNewsCollectService.removeByMap(removeNewsCollect);
    }
}
