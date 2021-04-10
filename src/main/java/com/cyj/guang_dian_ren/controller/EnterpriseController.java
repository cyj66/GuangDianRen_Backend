package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.Enterprise;
import com.cyj.guang_dian_ren.entity.News;
import com.cyj.guang_dian_ren.service.IEnterpriseService;
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
 * @since 2021-03-14
 */
@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
    @Autowired
    IEnterpriseService iEnterpriseService;

    @GetMapping("/list")
    public List<Enterprise> list() {
        return iEnterpriseService.list();
    }

}
