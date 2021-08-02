package com.weidd.best.springboot_mybatis;

import com.weidd.best.springboot_mybatis.mapper.UserDao;
import com.weidd.best.springboot_mybatis.pojo.User;
import com.weidd.best.springboot_mybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@SpringBootTest //单元测试注解
class SpringbootMybatisApplicationTests extends BasicTest {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        List<User> all = userService.findAll();

        System.out.println(all);
        System.out.println("*******************");
        userService.findAll().forEach(user -> System.out.println(user.getName()));
    }

}
