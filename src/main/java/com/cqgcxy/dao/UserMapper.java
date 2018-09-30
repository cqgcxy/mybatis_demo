package com.cqgcxy.dao;

import com.cqgcxy.domain.UserDO;

import java.util.List;

/**
 * @author icechen1219
 * @created 18-8-26
 */
public interface UserMapper {
    /**
     * 查询所有用户
     * @return 用户列表
     */
    List<UserDO> findAll();
    List<UserDO> findByUserName(String userName);
}
