package com.zhuawatou.service.impl;

import com.zhuawatou.entity.Blog;
import com.zhuawatou.mapper.BlogMapper;
import com.zhuawatou.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 爪哇头
 * @since 2020-08-25
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
