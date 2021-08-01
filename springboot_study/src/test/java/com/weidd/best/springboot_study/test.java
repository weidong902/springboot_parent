package com.weidd.best.springboot_study;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: springboot_parent
 * @author: weidd
 * @date: 2021-07-30 17:01
 **/
public class test {
    @Test
    public void test() throws ParseException {
        String str = "20210730";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date parse = dateFormat.parse(str);
        System.out.println(parse);
        System.out.println("222222222222222");

    }
}
