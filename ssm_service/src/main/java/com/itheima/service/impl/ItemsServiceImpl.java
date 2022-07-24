package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    public int save(Items items) {
        int rows = itemsDao.save(items);
        System.out.println(rows);
        //测试事务，如果出错，是否回滚
        //int q = 10/0;
        return rows;
    }
}
