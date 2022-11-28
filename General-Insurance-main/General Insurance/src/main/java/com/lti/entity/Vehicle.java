package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "VEHICLE")
public class Vehicle {
	
	
	@Id
	@SequenceGenerator(name = "vehicle_id", initialValue = 1, allocationSize=1)
	@GeneratedValue
	@Column(name = "VehId")
	private int id;
	
	@Column(name = "VehType")
	private String type;
	
	@Column(name = "VehModel")
	private String model;
	
	@Column(name = "Manufacturer")
	private String manufacturer;
	
	@Column(name = "DrivingLicense", unique = true)
	private String drivingLicense;
	
	@Column(name = "PurchaseDate")
	private LocalDate purchaseDate;
	
	@Column(name = "RegNo", unique = true)
	private String registrationNo;
	
	@Column(name = "EngineNo",unique = true)
	private String engineNo;
	
	@Column(name = "ChassisNo", unique = true)
	private String chassisNo;
	
	@Column(name = "EngineType")
	private String engineType;  //petrol/diesel
	
	@Column(name = "Last_Renew_Date")
	private LocalDate lastRenewDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "CustId")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public LocalDate getLastRenewDate() {
		return lastRenewDate;
	}

	public void setLastRenewDate(LocalDate lastRenewDate) {
		this.lastRenewDate = lastRenewDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle(int id, String type, String model, String manufacturer, String drivingLicense,
			LocalDate purchaseDate, String registrationNo, String engineNo, String chassisNo, String engineType,
			LocalDate lastRenewDate, Customer customer) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
		this.manufacturer = manufacturer;
		this.drivingLicense = drivingLicense;
		this.purchaseDate = purchaseDate;
		this.registrationNo = registrationNo;
		this.engineNo = engineNo;
		this.chassisNo = chassisNo;
		this.engineType = engineType;
		this.lastRenewDate = lastRenewDate;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", model=" + model + ", manufacturer=" + manufacturer
				+ ", drivingLicense=" + drivingLicense + ", purchaseDate=" + purchaseDate + ", registrationNo="
				+ registrationNo + ", engineNo=" + engineNo + ", chassisNo=" + chassisNo + ", engineType=" + engineType
				+ ", lastRenewDate=" + lastRenewDate + ", customer=" + customer + "]";
	}
	
	
	
	
}
