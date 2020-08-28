package com.zhuawatou.service.impl;

import com.zhuawatou.entity.User;
import com.zhuawatou.mapper.UserMapper;
import com.zhuawatou.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
