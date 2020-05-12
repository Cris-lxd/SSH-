package com.lxd;/*
 *  create by 20224
 *  2020/5/10
 * */

import com.lxd.Dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class TestMybatis{
    @Test
    public void run() throws IOException {
         InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = build.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.findAll();

        //关闭资源
        in.close();
        sqlSession.close();

    }
}