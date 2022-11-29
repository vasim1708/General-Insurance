package com.lti.beans;

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
@Table(name = "CUSTOMERS")

public class Customer {
	
	@Id
	//@SequenceGenerator(name = "id", initialValue = 1, allocationSize=1)
	//@GeneratedValue
	@Column(name="CustId",length = 10)
	private int custid;
	
	@Column(name = "CustName",length = 20)
	private String custName;
	
	@Column(name = "CustMail",length = 20)
	private String custMail;
	
	@Column(name = "CustDOB")
	private LocalDate dateOfBirth;
	
	@Column(name = "CustContactNo",length = 10)
	private long contactNo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="AddrId")
	private Address address;

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMail() {
		return custMail;
	}

	public void setCustMail(String custMail) {
		this.custMail = custMail;
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

	public Customer(int custid, String custName, String custMail, LocalDate dateOfBirth, long contactNo,
			Address address) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.custMail = custMail;
		this.dateOfBirth = dateOfBirth;
		this.contactNo = contactNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", custMail=" + custMail + ", dateOfBirth="
				+ dateOfBirth + ", contactNo=" + contactNo + ", address=" + address + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
}