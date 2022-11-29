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
	private int UserId;

	@Column(name = "UserMail")
	private String UserMail;

	@Column(name = "UserPass")
	private String UserPass;

	@Column(name = "Role")
	private String Role;

	@Column(name = "Last_Password_Set")
	private LocalDate lastPasswordSet;

	@Column(name = "CreatedOn")
	private LocalDate createdOn;

	@Column(name = "LastLogin")
	private LocalDate lastLogin;
	

	@Column(name = "OTP")
	private String otp;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CustId")
	private Customer customer;
	
	
	public User() {
		super();
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserMail() {
		return UserMail;
	}

	public void setUserMail(String userMail) {
		UserMail = userMail;
	}

	public String getUserPass() {
		return UserPass;
	}

	public void setUserPass(String userPass) {
		UserPass = userPass;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
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

	public LocalDate getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDate lastLogin) {
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

	public User(int userId, String userMail, String userPass, String role, LocalDate lastPasswordSet,
			LocalDate createdOn, LocalDate lastLogin, String otp, Customer customer) {
		super();
		UserId = userId;
		UserMail = userMail;
		UserPass = userPass;
		Role = role;
		this.lastPasswordSet = lastPasswordSet;
		this.createdOn = createdOn;
		this.lastLogin = lastLogin;
		this.otp = otp;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserMail=" + UserMail + ", UserPass=" + UserPass + ", Role=" + Role
				+ ", lastPasswordSet=" + lastPasswordSet + ", createdOn=" + createdOn + ", lastLogin=" + lastLogin
				+ ", otp=" + otp + ", customer=" + customer + "]";
	}

	
	
	
	

}
