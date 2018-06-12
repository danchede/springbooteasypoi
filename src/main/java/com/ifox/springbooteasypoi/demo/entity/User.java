package com.ifox.springbooteasypoi.demo.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:16 2018/6/10
 * @Modified By:
 */
public class User {
    private Integer id;

    @Excel(name = "姓名", orderNum = "0")
    private String name;

    @Excel(name = "年龄", orderNum = "1")
    private Integer age;

    @Excel(name = "性别", replace = {"男_1","女_0"}, orderNum = "2")
    private Boolean sex;

    @Excel(name = "出生日期", exportFormat = "yyyy-MM-dd", orderNum = "3")
    private Date birthday;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
