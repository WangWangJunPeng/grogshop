package com.wjp.pojo;

import java.util.Date;

public class GrogshopAndStatus {
	private Integer id;
	private String name;
	private String phone;
	private String address;
	private Date apply_time;
	private String status;
	
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
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getApply_time() {
		return apply_time;
	}
	public void setApply_time(Date apply_time) {
		this.apply_time = apply_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "GrogshopAndStatus [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", apply_time=" + apply_time + ", status=" + status + "]";
	}
}
