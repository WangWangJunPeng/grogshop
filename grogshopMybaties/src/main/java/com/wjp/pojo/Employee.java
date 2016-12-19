package com.wjp.pojo;

public class Employee {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Integer empLimitId;

    private Integer empStatusId;

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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

	public Integer getEmpLimitId() {
		return empLimitId;
	}

	public void setEmpLimitId(Integer empLimitId) {
		this.empLimitId = empLimitId;
	}

	public Integer getEmpStatusId() {
		return empStatusId;
	}

	public void setEmpStatusId(Integer empStatusId) {
		this.empStatusId = empStatusId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", email=" + email + ", empLimitId=" + empLimitId + ", empStatusId=" + empStatusId + "]";
	}
}