package com.cyj.guang_dian_ren.service.impl;

import com.cyj.guang_dian_ren.entity.User;
import com.cyj.guang_dian_ren.mapper.UserMapper;
import com.cyj.guang_dian_ren.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
