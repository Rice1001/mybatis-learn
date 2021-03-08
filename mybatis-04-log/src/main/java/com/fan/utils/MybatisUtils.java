package com.fan.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author rice
 * @version 1.0
 * @date 2021/3/7 8:48
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {

        //获取SqlSessionFactory对象
        try {
            String resource = "mybatis-config.xml";
            InputStream in = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * SqlSession包含了面向数据库执行SQL命令所需的所有方法
     *
     * @return SqlSession
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
