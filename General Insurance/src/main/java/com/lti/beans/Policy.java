package com.lti.beans;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "POLICYS")
public class Policy {

	@Id
	//@SequenceGenerator(name = "policy_id", initialValue = 1, allocationSize = 1)
	//@GeneratedValue
	@Column(name = "PolicyId")
	private int pid;

	@Column(name = "Status")
	private String status;

	@Column(name = "IssueDate")
	private LocalDate issueDate;

	
	@Column(name = "ExpiryDate")
	private LocalDate expiryDate;

	@Column(name = "Duration")
	private int duration;

	@Column(name = "PolicyAmount")
	private double policyAmount;

	@Column(name = "PlanAmount")
	private double planAmount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CustId")
	private Customer customer;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "InsId")
	private InsurancePlan insurancePlan;

	public int getId() {
		return pid;
	}

	public void setId(int id) {
		this.pid = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}

	public double getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(double planAmount) {
		this.planAmount = planAmount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public InsurancePlan getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(InsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	public Policy(int pid, String status, LocalDate issueDate, LocalDate expiryDate, int duration, double policyAmount,
			double planAmount, Customer customer, InsurancePlan insurancePlan) {
		super();
		this.pid = pid;
		this.status = status;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.duration = duration;
		this.policyAmount = policyAmount;
		this.planAmount = planAmount;
		this.customer = customer;
		this.insurancePlan = insurancePlan;
	}

	@Override
	public String toString() {
		return "Policy [pid=" + pid + ", status=" + status + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate
				+ ", duration=" + duration + ", policyAmount=" + policyAmount + ", planAmount=" + planAmount
				+ ", customer=" + customer + ", insurancePlan=" + insurancePlan + "]";
	}

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}