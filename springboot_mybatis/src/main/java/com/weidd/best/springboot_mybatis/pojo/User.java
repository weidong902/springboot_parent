package com.weidd.best.springboot_mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: springboot_parent
 * @author: weidd
 * @date: 2021-08-01 17:14
 **/
public class User {
    private Integer id;
    private String name;
    private Date brithday;
    private BigDecimal salary;

    public User() {
    }

    public User(Integer id, String name, Date brithday, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.brithday = brithday;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}