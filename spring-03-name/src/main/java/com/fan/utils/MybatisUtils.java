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

        //��ȡSqlSessionFactory����
        try {
            String resource = "mybatis-config.xml";
            InputStream in = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * SqlSession�������������ݿ�ִ��SQL������������з���
     *
     * @return SqlSession
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
