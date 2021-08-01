package com.weidd.best.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: springboot_parent
 * @author: weidd
 * @date: 2021-07-30 16:58
 **/
public class Test {
    public static void main(String[] args) throws ParseException {
        String str ="20210730";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date parse = dateFormat.parse(str);
        System.out.println(parse);
        System.out.println("222222222222222");


    }
}
