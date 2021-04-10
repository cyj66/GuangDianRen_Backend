package com.cyj.guang_dian_ren.service.impl;

import com.cyj.guang_dian_ren.entity.News;
import com.cyj.guang_dian_ren.mapper.NewsMapper;
import com.cyj.guang_dian_ren.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-03-14
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
