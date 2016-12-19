package com.wjp.pojo;

import java.math.BigDecimal;

public class GRoom {
    private Integer id;

    private BigDecimal area;

    private String scene;

    private String bed;

    private Integer numLimit;

    private Integer initNumber;

    private Integer remainNumber;

    private Integer gRoomStarId;

    private Integer grogshopId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene == null ? null : scene.trim();
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed == null ? null : bed.trim();
    }

    public Integer getNumLimit() {
        return numLimit;
    }

    public void setNumLimit(Integer numLimit) {
        this.numLimit = numLimit;
    }

    public Integer getInitNumber() {
        return initNumber;
    }

    public void setInitNumber(Integer initNumber) {
        this.initNumber = initNumber;
    }

    public Integer getRemainNumber() {
        return remainNumber;
    }

    public void setRemainNumber(Integer remainNumber) {
        this.remainNumber = remainNumber;
    }

    public Integer getgRoomStarId() {
        return gRoomStarId;
    }

    public void setgRoomStarId(Integer gRoomStarId) {
        this.gRoomStarId = gRoomStarId;
    }

    public Integer getGrogshopId() {
        return grogshopId;
    }

    public void setGrogshopId(Integer grogshopId) {
        this.grogshopId = grogshopId;
    }
}