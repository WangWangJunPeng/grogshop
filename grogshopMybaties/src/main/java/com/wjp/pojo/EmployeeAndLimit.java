package com.wjp.pojo;

public class EmployeeAndLimit {
	private Integer id;
	private String username;
	private String phone;
	private String email;
	private String code;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "EmployeeAndLimit [id=" + id + ", username=" + username + ", phone=" + phone + ", email=" + email
				+ ", code=" + code + "]";
	}
}
