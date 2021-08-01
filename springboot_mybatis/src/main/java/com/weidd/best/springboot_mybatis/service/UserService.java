package com.weidd.best.springboot_mybatis.service;

import com.weidd.best.springboot_mybatis.pojo.User;

import java.util.List;

/**
 * @program: springboot_parent
 * @author: weidd
 * @date: 2021-08-01 17:22
 **/
public interface UserService {

    void add(User user);

    List<User> findAll();

}
