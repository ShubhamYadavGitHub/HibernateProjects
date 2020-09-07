package com.oehm4.basics.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity

@Table (name = "account_details")

public class AccountDTO implements Serializable {

	@Id
	
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "ACCOUNT_HOLDER_NAME")
	private String accountHolderName;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "ACCOUNT_NUMBER")
	private Long accountNumber;
	
	@Column(name = "MOBILE_NUMBER")
	private Long mobileNumber;
	
	@Column(name = "BALANCE")
	private Double balance;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
}
