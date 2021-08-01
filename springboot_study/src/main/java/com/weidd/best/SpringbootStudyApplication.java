package com.weidd.best;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//用在类上,只能出现一次.作用是标识这个类是springboot入口类,启动整个springboot的总入口.
//总结:1:引入pom依赖,2:resources生成application.yml配置文件 3:创建springboot启动类,加入@SpringBootApplication注解.在main中启动
@SpringBootApplication
public class SpringbootStudyApplication {

    public static void main(String[] args) { //args:启动时通过jvm传递的参数:VM options
        // 启动springboot应用,参数1:指定入口类的对象.class,参数2:main方法的参数
        SpringApplication.run(SpringbootStudyApplication.class, args);

    }

}
/**
 * @SpringBootApplication :注解:组合注解,有多个注解组合而来
 * @SpringBootConfiguration :这个注解是用来自动配置spring springmvc(初始化 servlet..)相关环境
 * @EnableAutoConfiguration : 开启自动配置(自动配置核心注解) 自动配置spring相关环境,自动与项目中引入的第三方技术自动配置
 *                              mybatis-springboot \ redis-springboot \ es-springboot  \ rabbitmq-springboot 第三方技术
 * @ComponentScan :         组件扫描 spring根据注解去发挥作用(默认扫描当前包及其子包)
 */
