package com.wjp.pojo;

import java.math.BigDecimal;

public class GRoomPrice {
    private Integer id;

    private String isBreakfast;

    private BigDecimal price;

    private Integer gRoomId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsBreakfast() {
        return isBreakfast;
    }

    public void setIsBreakfast(String isBreakfast) {
        this.isBreakfast = isBreakfast == null ? null : isBreakfast.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getgRoomId() {
        return gRoomId;
    }

    public void setgRoomId(Integer gRoomId) {
        this.gRoomId = gRoomId;
    }
}