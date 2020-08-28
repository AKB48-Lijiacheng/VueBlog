package com.zhuawatou.controller;


import com.zhuawatou.common.lang.Result;
import com.zhuawatou.entity.User;
import com.zhuawatou.service.BlogService;
import com.zhuawatou.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 爪哇头
 * @since 2020-08-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequiresAuthentication
    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1);
        return Result.succ(user);
    }


    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user){

        return Result.succ(user);
    }

}
