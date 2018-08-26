package com.cqgcxy.dao;

import com.cqgcxy.domain.DeviceInfoDO;
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
public class DeviceInfoMapperTest {
    Logger logger = LoggerFactory.getLogger(DeviceInfoMapperTest.class);
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
    public void findByYear() {
        List<DeviceInfoDO> deviceList = sqlSession.getMapper(DeviceInfoMapper.class).findByYear();
        Assert.assertNotNull(deviceList);
        Assert.assertEquals(1,deviceList.size());
        for (DeviceInfoDO deviceInfoDO : deviceList) {
            logger.debug(deviceInfoDO.toString());
        }
    }
}