package com.wjp.pojo;

public class Grogshop {
    private Integer id;

    private String name;

    private String address;

    private String phone;

    private Integer gStatusId;

    private Integer gStarId;
    
    private GStatus g_status;

	public GStatus getG_status() {
		return g_status;
	}

	public void setG_status(GStatus g_status) {
		this.g_status = g_status;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getgStatusId() {
        return gStatusId;
    }

    public void setgStatusId(Integer gStatusId) {
        this.gStatusId = gStatusId;
    }

    public Integer getgStarId() {
        return gStarId;
    }

    public void setgStarId(Integer gStarId) {
        this.gStarId = gStarId;
    }

	@Override
	public String toString() {
		return "Grogshop [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", gStatusId="
				+ gStatusId + ", gStarId=" + gStarId + "]";
	}
}