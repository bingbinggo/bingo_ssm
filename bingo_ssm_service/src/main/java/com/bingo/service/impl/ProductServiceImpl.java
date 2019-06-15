package com.bingo.service.impl;

import com.bingo.dao.IProductDao;
import com.bingo.domain.Orders;
import com.bingo.domain.Product;
import com.bingo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bingo on 2019/6/15
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao iProductDao;

    @Override
    public List<Product> findAll() {
        return iProductDao.findAll();
    }

    @Override
    public void save(Product product) {
        iProductDao.save(product);
    }




}
