package com.bingo.dao;

import com.bingo.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * Created by bingo on 2019/6/15
 */
public interface IMemberDao {

    //根据id查询产品
    @Select("select * from member where id=#{id}")
    public Member findById(String id) throws Exception;
}
