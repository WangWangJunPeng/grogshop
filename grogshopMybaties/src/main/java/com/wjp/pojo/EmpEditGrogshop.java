package com.wjp.pojo;

import java.util.Date;

public class EmpEditGrogshop {
    private Integer id;

    private Date editTime;

    private Integer employeeId;

    private Integer grogshopId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getGrogshopId() {
        return grogshopId;
    }

    public void setGrogshopId(Integer grogshopId) {
        this.grogshopId = grogshopId;
    }
}