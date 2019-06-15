package com.bingo.service.impl;

import com.bingo.dao.IOrderDao;
import com.bingo.domain.Orders;
import com.bingo.service.IOrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bingo on 2019/6/15
 */
@Service
@Transactional
public class OrderServiceImpl implements IOrdersService {

    @Autowired
    private IOrderDao iOrderDao;

    @Override
    public Orders findById(String orderId) {
        Orders orders = iOrderDao.findById(orderId);
        return orders;
    }



    @Override
    public List<Orders> findAll(int page,int size) {

        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        List<Orders> orders=iOrderDao.findAll();
        return orders;
    }
}
