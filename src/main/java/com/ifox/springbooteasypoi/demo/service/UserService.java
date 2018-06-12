package com.ifox.springbooteasypoi.demo.service;

import com.ifox.springbooteasypoi.demo.entity.User;

import java.util.ArrayList;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:24 2018/6/10
 * @Modified By:
 */


public interface UserService {
    /**
     * selectByPrimaryKey
     * @param id 根据id查询信息
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * findAllUser
     * @param name 根据姓名查询记录
     * @return
     */
    ArrayList<User> findUsername(String name);

    /**
     * findAll
     * @param record 查询表中所有信息
     * @return
     */
    ArrayList<User> findAll(User record);
}
