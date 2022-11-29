package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERSTABLE")

public class Customer {
	
	@Id
	@SequenceGenerator(name = "id", initialValue = 1, allocationSize=1)
	@GeneratedValue
	@Column(name="CustId")
	private int cid;
	
	@Column(name = "CustName")
	private String name;
	
	@Column(name = "CustMail")
	private String emailId;
	
	@Column(name = "CustDOB")
	private LocalDate dateOfBirth;
	
	@Column(name = "CustContactNo")
	private long contactNo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="AddrId")
	private Address address;


	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer(int id, String name, String emailId, LocalDate dateOfBirth, long contactNo, Address address) {
		super();
		this.cid = id;
		this.name = name;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.contactNo = contactNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + cid + ", name=" + name + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth
				+ ", contactNo=" + contactNo + ", address=" + address + "]";
	}
	
	

	
}