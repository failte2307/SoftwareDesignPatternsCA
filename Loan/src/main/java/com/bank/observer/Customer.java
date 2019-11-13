package com.bank.observer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@Column(name = "Customer_Id")
	private int customerId;

	@Column(name = "Customer_Name")
	private String name;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Mobile_No")
	private String mobileNo;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Credit_Rating")
	private String creditRating;
	
	@Column(name = "Country")
	private String country;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}

	public Customer(int customerId, String name, String email, String mobileNo, String address, String creditRating , String country) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.creditRating = creditRating;
		this.country = country;
	}
	
	public Customer(CustomerDTO dto) {
		this.customerId = dto.getCustomerId();
		this.name = dto.getName();
		this.email = dto.getEmail();
		this.mobileNo = dto.getMobileNo();
		this.address = dto.getAddress();
		this.creditRating = dto.getCreditRating();
		this.country = dto.getCountry();
	}

	public Customer() {
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	
	

}
