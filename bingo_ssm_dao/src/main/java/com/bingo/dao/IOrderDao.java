package com.bingo.dao;

import com.bingo.domain.Member;
import com.bingo.domain.Orders;
import com.bingo.domain.Product;
import com.bingo.domain.Traveller;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by bingo on 2019/6/15
 */
public interface IOrderDao {
    @Select("select * from orders where id=#{orderId}")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.bingo.dao.IProductDao.findById")),
            @Result(property = "member",column = "memberId",javaType = Member.class,one = @One(select = "com.bingo.dao.IMemberDao.findById")),
            @Result(property = "travellers",column = "memberId",javaType = java.util.List.class, many= @Many(select = "com.bingo.dao.ITravellerDao.findByOrderId")),
    })
    public Orders findById(String orderId);

    @Select("select * from orders")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.bingo.dao.IProductDao.findById")),
    })
    public List<Orders> findAll();

}
