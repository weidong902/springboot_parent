package com.weidd.best.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: springboot_parent
 * @author: weidd
 * @date: 2021-07-26 21:37
 **/
@RestController
public class TestController {

    @RequestMapping("hello")
    public String hello() {
        return "springboot test ~~";
    }

}
