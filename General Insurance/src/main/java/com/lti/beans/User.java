package com.lti.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "USERS")

public class User {

	@Id
	//@SequenceGenerator(name = "user_id", initialValue = 1, allocationSize = 1)
	//@GeneratedValue
	@Column(name = "UserId")
	private int id;

	@Column(name = "UserMail")
	private String emailId;

	@Column(name = "UserPass")
	private String password;

	@Column(name = "Role")
	private String role;

	@Column(name = "Last_Password_Set")
	private LocalDate lastPasswordSet;

	@Column(name = "CreatedOn")
	private LocalDate createdOn;

	@Column(name = "LastLogin")
	private LocalDateTime lastLogin;

	@Column(name = "OTP")
	private String otp;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CustId")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDate getLastPasswordSet() {
		return lastPasswordSet;
	}

	public void setLastPasswordSet(LocalDate lastPasswordSet) {
		this.lastPasswordSet = lastPasswordSet;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public User(int id, String emailId, String password, String role, LocalDate lastPasswordSet, LocalDate createdOn,
			LocalDateTime lastLogin, String otp, Customer customer) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
		this.lastPasswordSet = lastPasswordSet;
		this.createdOn = createdOn;
		this.lastLogin = lastLogin;
		this.otp = otp;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", emailId=" + emailId + ", password=" + password + ", role=" + role
				+ ", lastPasswordSet=" + lastPasswordSet + ", createdOn=" + createdOn + ", lastLogin=" + lastLogin
				+ ", otp=" + otp + ", customer=" + customer + "]";
	} 
	
	
	

}
