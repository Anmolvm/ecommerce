package com.hsbc.auditing.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HSBCUser")
public class User {

	@Id
	@Column(name="MobileNo")
	private long mobileNo;
	@Column(name="Name",nullable=false,length=50)
	private String name;
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
