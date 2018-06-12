package com.ifox.springbooteasypoi.demo.service.impl;

import com.ifox.springbooteasypoi.demo.dao.UserDao;
import com.ifox.springbooteasypoi.demo.entity.User;
import com.ifox.springbooteasypoi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:25 2018/6/10
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        Assert.notNull(userDao, "userDao不能为null");
        this.userDao = userDao;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public ArrayList<User> findUsername(String name) {
        return userDao.findUsername(name);
    }

    @Override
    public ArrayList<User> findAll(User record) {
        return userDao.findAll(record);
    }
}
