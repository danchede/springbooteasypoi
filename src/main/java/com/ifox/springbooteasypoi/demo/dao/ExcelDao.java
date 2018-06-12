package com.ifox.springbooteasypoi.demo.dao;

import com.ifox.springbooteasypoi.demo.entity.Excel;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:23 2018/6/10
 * @Modified By:
 */
@Mapper
public interface ExcelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Excel record);

    int insertSelective(Excel record);

    Excel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Excel record);

    int updateByPrimaryKey(Excel record);
}
