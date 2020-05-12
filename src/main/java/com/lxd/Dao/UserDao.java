package com.lxd.Dao;/*
 *  create by 20224
 *  2020/5/10
 * */

import com.lxd.Entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select("select * from account")
    public List<User> findAll();

}
