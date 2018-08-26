package com.cqgcxy.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author icechen1219
 * @created 18-8-26
 */
public class DeviceInfoDO {
    private Integer id;
    private String deviceNo;
    private BigDecimal outPrice;
    private Date outDate;

    @Override
    public String toString() {
        return "DeviceInfoDO{" +
                "id=" + id +
                ", deviceNo='" + deviceNo + '\'' +
                ", outPrice=" + outPrice +
                ", outDate=" + outDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public BigDecimal getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(BigDecimal outPrice) {
        this.outPrice = outPrice;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }
}
