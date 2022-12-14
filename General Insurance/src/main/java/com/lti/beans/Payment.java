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
@Table(name = "PAYMENTS")
public class Payment {
	@Id
	//@SequenceGenerator(name = "payment_id", initialValue = 1, allocationSize = 1)
	//@GeneratedValue
	@Column(name = "PaymentId")
	private int id;

	@Column(name = "PaymentMode")
	private String mode;

	@Column(name = "PaymentDate")
	private LocalDate date;

	@Column(name = "PaymentAmount")
	private double amount;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CustId")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Payment(int id, String mode, LocalDate date, double amount, Customer customer) {
		super();
		this.id = id;
		this.mode = mode;
		this.date = date;
		this.amount = amount;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", mode=" + mode + ", date=" + date + ", amount=" + amount + ", customer="
				+ customer + "]";
	}

	

}