package com.bank.observer;

import javax.persistence.Column;
import javax.persistence.Id;

public class CustomerDTO {
	
	private int customerId;

	private String name;
	
	private String email;
	
	private String mobileNo;
	
	private String address;
	
	private String creditRating;
	
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

	public CustomerDTO(int customerId, String name, String email, String mobileNo, String address, String creditRating , String country) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.creditRating = creditRating;
		this.country = country;
	}

	public CustomerDTO() {
	}
	
	public CustomerDTO(Customer entity) {
		this.customerId = entity.getCustomerId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.mobileNo = entity.getMobileNo();
		this.address = entity.getAddress();
		this.creditRating = entity.getCreditRating();
		this.country = entity.getCountry();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	
	


}
