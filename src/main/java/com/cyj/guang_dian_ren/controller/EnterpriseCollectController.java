package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.EnterpriseCollect;
import com.cyj.guang_dian_ren.service.IEnterpriseCollectService;
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
@RequestMapping("/enterprise-collect")
public class EnterpriseCollectController {
    @Autowired
    IEnterpriseCollectService iEnterpriseCollectService;

    @GetMapping("/list")
    public List<EnterpriseCollect> list() {
        return iEnterpriseCollectService.list();
    }

    @PostMapping("/save")
    public void save(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer enterpriseId= (Integer) para.get("enterpriseId");
        EnterpriseCollect enterpriseCollect = new EnterpriseCollect(enterpriseId,username);
        enterpriseCollect.setUsername(username);
        enterpriseCollect.setEnterpriseId(enterpriseId);
        iEnterpriseCollectService.save(enterpriseCollect);
    }

    @DeleteMapping("/remove")
    public void remove(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        Integer enterpriseId= (Integer) para.get("enterpriseId");
        Map<String,Object> removeEnterpriseCollect = new HashMap<>();
        removeEnterpriseCollect.put("username", username);
        //注意不是“enterpriseId”,要和数据表字段名保持一致
        removeEnterpriseCollect.put("enterprise_id", enterpriseId);
        iEnterpriseCollectService.removeByMap(removeEnterpriseCollect);
    }
}
