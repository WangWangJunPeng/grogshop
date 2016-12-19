package com.wjp.pojo;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer ono;

    private Date createTime;

    private Integer oDetailId;

    private Integer orderStatusId;

    private Integer userId;

    private Integer gRoomId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOno() {
        return ono;
    }

    public void setOno(Integer ono) {
        this.ono = ono;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getoDetailId() {
        return oDetailId;
    }

    public void setoDetailId(Integer oDetailId) {
        this.oDetailId = oDetailId;
    }

    public Integer getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getgRoomId() {
        return gRoomId;
    }

    public void setgRoomId(Integer gRoomId) {
        this.gRoomId = gRoomId;
    }
}