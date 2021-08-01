package com.weidd.best.springboot_mybatis.mapper;

import com.weidd.best.springboot_mybatis.pojo.User;

import java.util.List;

/**
 * @program: springboot_parent
 * @author: weidd
 * @date: 2021-08-01 17:18
 **/

public interface UserDao {

    List<User> findAll();

    void add(User user);

}
