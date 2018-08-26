package com.cqgcxy.dao;

import com.cqgcxy.domain.UserDO;
import com.cqgcxy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author icechen1219
 * @created 18-8-26
 */
public class UserMapperTest {
    Logger logger = LoggerFactory.getLogger(UserMapperTest.class);
    private SqlSession sqlSession = null;

    @Before
    public void setUp() throws Exception {
        logger.debug("setUp...");
        sqlSession = MybatisUtil.createSqlSession();
    }

    @After
    public void tearDown() throws Exception {
        logger.debug("tearDown...");
        MybatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void testCount() {
        logger.debug("count begin...");
        // 采用旧版mybatis的操作方式，已经不推荐使用，缺点明显
        int count = sqlSession.selectOne("com.cqgcxy.dao.UserMapper.count");
        Assert.assertEquals(2, count);
        logger.debug("count end...");
    }

    @Test
    public void findAll() {
        logger.debug("findAll begin...");

        List<UserDO> userList = null;
        // 采用mybatis官方推荐的新方式：Mapper接口
        userList = sqlSession.getMapper(UserMapper.class).findAll();

        Assert.assertNotNull(userList);
        logger.debug("findAll end...");
    }
}