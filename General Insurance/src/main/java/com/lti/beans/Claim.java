
package com.lti.beans;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "CLAIM_HISTORY")
public class Claim {

	@Id
	//@SequenceGenerator(name = "claim_id", initialValue = 1, allocationSize = 1)
	//@GeneratedValue
	@Column(name="ClaimId")
	private int id;

	@Column(name = "ClaimDate")
	private LocalDate date;

	@Column(name = "Status")
	private String status;//approved or pending, not approved 

	@Column(name = "ClaimAmount")
	private double amount;

	@Column(name = "Reason")
	private String reason;

	@Column(name = "ContactNo")
	private long contactNo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CustId")
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PolicyId")
	private Policy policy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public Claim(int id, LocalDate date, String status, double amount, String reason, long contactNo, Customer customer,
			Policy policy) {
		super();
		this.id = id;
		this.date = date;
		this.status = status;
		this.amount = amount;
		this.reason = reason;
		this.contactNo = contactNo;
		this.customer = customer;
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "Claim [id=" + id + ", date=" + date + ", status=" + status + ", amount=" + amount + ", reason=" + reason
				+ ", contactNo=" + contactNo + ", customer=" + customer + ", policy=" + policy + "]";
	}
	
	




	

}
