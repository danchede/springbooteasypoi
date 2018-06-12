package com.ifox.springbooteasypoi.demo.controller;

import com.ifox.springbooteasypoi.demo.entity.Excel;
import com.ifox.springbooteasypoi.demo.entity.User;
import com.ifox.springbooteasypoi.demo.service.ExcelService;
import com.ifox.springbooteasypoi.demo.service.UserService;
import com.ifox.springbooteasypoi.demo.util.ExcelImport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:30 2018/6/10
 * @Modified By:
 */
@RestController
public class ExcelController {
    @Autowired
    private UserService userService;
    @Autowired
    private ExcelService excelService;

    @RequestMapping("export")
    public void export(HttpServletResponse response){
        User user =new User();
        user.setName("钟超");
        //从数据库获取需要导出的数据
        List<User> userList = userService.findUsername(user.getName());
        //导出操作
        ExcelImport.exportExcel(userList,"User表","信息",User.class,"User.xls",response);
    }

    @RequestMapping("list")
    @ResponseBody
    public List<User> list(HttpServletResponse response){
        User user = new User();
        //从数据库获取需要导出的数据
        List<User> userList = userService.findAll(user);
        ExcelImport.exportExcel(userList,"userTest表","user",User.class,"USerTest.xls",response);
        return userList;
    }

    @RequestMapping("select")
    @ResponseBody
    public User seclectTest(){
        User user = userService.selectByPrimaryKey(2);
        return user;
    }
    @RequestMapping("selectExcel")
    @ResponseBody
    public Excel seclectExcel(){
        Excel excel = excelService.selectByPrimaryKey(2);
        return excel;
    }
}
