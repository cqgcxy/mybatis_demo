package com.cqgcxy.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author icechen1219
 * @created 18-8-26
 */
public class MybatisUtil {
    private static SqlSessionFactory factory;

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(is);
        return factory;
    }

    public static SqlSession createSqlSession() {
        try {
            return getSqlSessionFactory().openSession(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closeSqlSession(SqlSession sqlSession) {
        if (null != sqlSession) {
            sqlSession.close();
        }
    }
}
