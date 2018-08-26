package com.cqgcxy.dao;

import com.cqgcxy.domain.DeviceInfoDO;

import java.util.List;

/**
 * @author icechen1219
 * @created 18-8-26
 */
public interface DeviceInfoMapper {
    List<DeviceInfoDO> findByYear();
}
