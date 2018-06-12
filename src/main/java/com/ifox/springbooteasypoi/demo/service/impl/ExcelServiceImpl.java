package com.ifox.springbooteasypoi.demo.service.impl;

import com.ifox.springbooteasypoi.demo.dao.ExcelDao;
import com.ifox.springbooteasypoi.demo.entity.Excel;
import com.ifox.springbooteasypoi.demo.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:28 2018/6/10
 * @Modified By:
 */
@Service
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    private ExcelDao excelDao;
    @Override
    public Excel selectByPrimaryKey(Integer id) {
        return excelDao.selectByPrimaryKey(id);
    }
}
