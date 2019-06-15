package com.bingo.dao;

import com.bingo.domain.Orders;
import com.bingo.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by bingo on 2019/6/14
 */
public interface IProductDao {
     /**
      * 查询所有商品信息
      * @return
      */
     @Select("select * from product")
     List<Product> findAll();

    //根据id查询产品
    @Select("select * from product where id=#{id}")
    public Product findById(String id) throws Exception;

    /**
     * 保存从
     * @param product
     */
    @Insert("insert into\n" +
            "product values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#\n" +
            "{productDesc},#{productStatus})")
    public void save(Product product);



}
