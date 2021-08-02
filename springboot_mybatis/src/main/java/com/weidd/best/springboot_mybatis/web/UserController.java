package com.weidd.best.springboot_mybatis.web;

import com.weidd.best.springboot_mybatis.pojo.User;
import com.weidd.best.springboot_mybatis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<User> finAll() {
        System.out.println("findAll 请求进来了");
        log.debug("debug 级别的日志...");
        return userService.findAll();
    }

    @RequestMapping("add")
    public void add(User user) {
        System.out.println("add 请求进来了");
        userService.add(user);
    }
}
