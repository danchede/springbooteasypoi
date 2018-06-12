package com.ifox.springbooteasypoi.demo.entity;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:17 2018/6/10
 * @Modified By:
 */
public class Excel {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private Double bodyweight;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getBodyweight() {
        return bodyweight;
    }

    public void setBodyweight(Double bodyweight) {
        this.bodyweight = bodyweight;
    }
}
