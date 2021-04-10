package com.cyj.guang_dian_ren.controller;


import com.cyj.guang_dian_ren.entity.News;
import com.cyj.guang_dian_ren.entity.User;
import com.cyj.guang_dian_ren.service.IUserService;
import com.cyj.guang_dian_ren.utils.TokenUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController{
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody Map<String,Object> para) throws JsonProcessingException {
        String username=(String)para.get("username");
        String password=(String)para.get("password");
        String token= TokenUtil.sign(new User(username,password));
        System.out.println(token);
        HashMap<String,Object> hs=new HashMap<>();
        hs.put("token",token);
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(hs);
    }

    @Autowired
    IUserService iUserService;
    @GetMapping("/list")
    public List<User> list() {
        return iUserService.list();
    }

    @PostMapping("/register")
    @ResponseBody
    public User register(@RequestBody Map<String,Object> para){
        String username=(String)para.get("username");
        String password=(String)para.get("password");
        User user=new User(username,password);
        user.setUsername(username);
        user.setPassword(password);
        iUserService.save(user);
        return user;
    }

}
