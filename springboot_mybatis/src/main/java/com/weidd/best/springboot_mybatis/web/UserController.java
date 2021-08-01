package com.weidd.best.springboot_mybatis.web;

import com.weidd.best.springboot_mybatis.pojo.User;
import com.weidd.best.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springboot_parent
 * @author: weidd
 * @date: 2021-08-01 17:23
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("finAll")
    public List<User> finAll() {
        System.out.println("请求进来了");
        return userService.findAll();
    }
}
