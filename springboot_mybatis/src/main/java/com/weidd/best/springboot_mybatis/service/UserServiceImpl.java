package com.weidd.best.springboot_mybatis.service;

import com.weidd.best.springboot_mybatis.mapper.UserDao;
import com.weidd.best.springboot_mybatis.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: springboot_parent
 * @author: weidd
 * @date: 2021-08-01 17:23
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> findAll() {
        logger.info("查询所有用户信息 logger打印日志");
        return userDao.findAll();
    }
}
