package com.kthome.jpa.entity;

import java.util.Date;

import javax.persistence.Column;

public class BaseEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8255610521912142283L;
	
	private String createBy;
	
	private Date createDate;
	
	private String updateBy;
	
	private Date updateDate;

	@Column(name = "CREATE_BY", nullable = false, length = 20)
	public String getCreateBy() {
		return createBy;
	}

	@Column(name = "CREATE_DATE", nullable = false)
	public Date getCreateDate() {
		return createDate;
	}

	@Column(name = "UPDATE_BY", length = 20)
	public String getUpdateBy() {
		return updateBy;
	}

	@Column(name = "UPDATE_DATE")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
