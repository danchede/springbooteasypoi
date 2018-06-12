package com.ifox.springbooteasypoi.demo.service;

import com.ifox.springbooteasypoi.demo.entity.Excel;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:25 2018/6/10
 * @Modified By:
 */
public interface ExcelService {
    /**
     * selectByPrimaryKey
     * @param id 根据id查询信息
     * @return
     */
    Excel selectByPrimaryKey(Integer id);
}
