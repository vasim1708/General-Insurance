package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INSURANCE_PLAN")
public class InsurancePlan {
	
	@Id
	//@SequenceGenerator(name = "insurance_id", initialValue = 1, allocationSize=1)
	//@GeneratedValue
	@Column(name = "InsId")
	private int id;
	
	@Column(name = "InsName")
	private String name;
	
	@Column(name = "InsType")
	private String type;//third party or comprehensive
	
	@Column(name = "InsAmount")
	private double amount;//2000
	
	@Column(name = "Commission")
	private int commission;//500
	
	@Column(name = "CompanyName")
	private String companyName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public InsurancePlan(int id, String name, String type, double amount, int commission, String companyName) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.amount = amount;
		this.commission = commission;
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "InsurancePlan [id=" + id + ", name=" + name + ", type=" + type + ", amount=" + amount + ", commission="
				+ commission + ", companyName=" + companyName + "]";
	}
	
	

		
}