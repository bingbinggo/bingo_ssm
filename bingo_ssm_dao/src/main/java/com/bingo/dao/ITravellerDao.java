package com.bingo.dao;

import com.bingo.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by bingo on 2019/6/15
 */
public interface ITravellerDao {
    @Select("SELECT\n" +
            "\t*\n" +
            "FROM\n" +
            "\ttraveller\n" +
            "WHERE\n" +
            "\tid IN (\n" +
            "\t\tSELECT\n" +
            "\t\t\ttravellerId\n" +
            "\t\tFROM\n" +
            "\t\t\torder_traveller\n" +
            "\t\tWHERE\n" +
            "\t\t\torderId = #{oderId}\n" +
            "\t)")
    public List<Traveller> findByOrderId(String oderId) throws Exception;
}
