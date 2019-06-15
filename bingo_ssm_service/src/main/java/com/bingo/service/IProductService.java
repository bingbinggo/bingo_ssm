package com.bingo.service;

import com.bingo.domain.Orders;
import com.bingo.domain.Product;

import java.util.List;

/**
 * Created by bingo on 2019/6/15
 */
public interface IProductService {

    public List<Product> findAll();


    public void save(Product product);


}
