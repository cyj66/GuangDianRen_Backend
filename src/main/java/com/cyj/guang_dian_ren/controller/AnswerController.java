package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.Answer;
import com.cyj.guang_dian_ren.service.IAnswerService;
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
@RequestMapping("/answer")
public class AnswerController {
    @Autowired
    IAnswerService iAnswerService;
    @GetMapping("/list")
    public List<Answer> list() {
        return iAnswerService.list();
    }
}
