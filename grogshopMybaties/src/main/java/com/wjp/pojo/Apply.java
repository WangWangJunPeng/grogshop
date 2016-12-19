package com.wjp.pojo;

import java.util.Date;

public class Apply {
    private Integer id;

    private Date applyTime;

    private Integer userId;

    private Integer grogshopId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGrogshopId() {
        return grogshopId;
    }

    public void setGrogshopId(Integer grogshopId) {
        this.grogshopId = grogshopId;
    }
}