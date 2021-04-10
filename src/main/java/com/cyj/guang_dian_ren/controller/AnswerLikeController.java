package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.AnswerLike;
import com.cyj.guang_dian_ren.service.IAnswerLikeService;
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
@RequestMapping("/answer-like")
public class AnswerLikeController {
    @Autowired
    IAnswerLikeService iAnswerLikeService;

    @GetMapping("/list")
    public List<AnswerLike> list() {
        return iAnswerLikeService.list();
    }

    @PostMapping("/save")
    public void save(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer answerId= (Integer) para.get("answerId");
        AnswerLike answerLike = new AnswerLike(answerId,username);
        answerLike.setUsername(username);
        answerLike.setAnswerId(answerId);
        iAnswerLikeService.save(answerLike);
    }

    @DeleteMapping("/remove")
    public void remove(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer AnswerId= (Integer) para.get("answerId");
        Map<String,Object> removeAnswerLike = new HashMap<>();
        removeAnswerLike.put("username", username);
        //注意不是“AnswerId”,要和数据表字段名保持一致
        removeAnswerLike.put("answer_id", AnswerId);
        iAnswerLikeService.removeByMap(removeAnswerLike);
    }


}
