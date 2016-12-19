package com.wjp.pojo;

import java.util.Date;

public class OrderAll {
	private int id;
	private String shopName;
	private String address;
	private String shopPhone;
	private String userName;
	private String userPhone;
	private Date checkIn_time;
	private Date checkOut_time;
	private String orderStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getShopPhone() {
		return shopPhone;
	}
	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Date getCheckIn_time() {
		return checkIn_time;
	}
	public void setCheckIn_time(Date checkIn_time) {
		this.checkIn_time = checkIn_time;
	}
	public Date getCheckOut_time() {
		return checkOut_time;
	}
	public void setCheckOut_time(Date checkOut_time) {
		this.checkOut_time = checkOut_time;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
}
