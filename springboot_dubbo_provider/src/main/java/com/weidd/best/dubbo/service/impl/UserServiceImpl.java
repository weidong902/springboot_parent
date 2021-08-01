package com.weidd.best.dubbo.service.impl;

import com.weidd.best.dubbo.service.UserService;

/**
 * @program: springboot_parent
 * @author: weidd
 * @date: 2021-07-11 21:15
 **/
public class UserServiceImpl implements UserService {
    @Override
    public String testDubbo() {
        System.out.println("测试dubbo");
        return "test Dubbo ";
    }
}
