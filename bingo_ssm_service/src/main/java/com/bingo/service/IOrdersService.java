package com.bingo.service;

import com.bingo.domain.Orders;

import java.util.List;

/**
 * Created by bingo on 2019/6/15
 */
public interface IOrdersService {
    public Orders findById(String orderId);

    /*public List<Orders> findAll();*/

    List<Orders> findAll(int page, int size);
}
