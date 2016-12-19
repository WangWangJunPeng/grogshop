package com.wjp.pojo;

public class GImg {
    private Integer id;

    private String imageUrl;

    private Integer grogshopId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Integer getGrogshopId() {
        return grogshopId;
    }

    public void setGrogshopId(Integer grogshopId) {
        this.grogshopId = grogshopId;
    }
}