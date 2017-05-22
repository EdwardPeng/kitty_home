package com.kthome.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_PROFILE")
public class UserProfile extends BaseEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8115967351737401070L;
	
	private String userId;
	
	private String userName;
	
	private String gender;
	
	private String zip;
	
	private String address;
	
	private String phone;
	
	private String line;
	
	private String status;
	
	private String remark1;
	
	private String remark2;
	
	private String remark3;

	@Id
	@Column(name = "USER_ID", nullable = false, length = 50)
	public String getUserId() {
		return userId;
	}

	@Column(name = "USER_NAME", length = 200)
	public String getUserName() {
		return userName;
	}

	@Column(name = "GENDER", length = 1)
	public String getGender() {
		return gender;
	}

	@Column(name = "ZIP", length = 5)
	public String getZip() {
		return zip;
	}

	@Column(name = "ADDRESS", length = 1000)
	public String getAddress() {
		return address;
	}

	@Column(name = "PHONE", length = 50)
	public String getPhone() {
		return phone;
	}
	
	@Column(name = "LINE", length = 50)
	public String getLine() {
		return line;
	}

	@Column(name = "STATUS", length = 3)
	public String getStatus() {
		return status;
	}

	@Column(name = "REMARK1", length = 50)
	public String getRemark1() {
		return remark1;
	}

	@Column(name = "REMARK2", length = 50)
	public String getRemark2() {
		return remark2;
	}

	@Column(name = "REMARK3", length = 50)
	public String getRemark3() {
		return remark3;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	public void setLine(String line) {
		this.line = line;
	}

}
