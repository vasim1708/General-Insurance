package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_TABLE")
public class Address {
	
	@Id
	@SequenceGenerator(name = "AddrSeq", initialValue = 1, allocationSize=1)
	@GeneratedValue
	@Column(name="AddrId")
	private int addid;
	
	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	@Column(name = "City")
	private String city;
	
	@Column(name = "Pincode")
	private int pincode;
	
	@Column(name = "LandMark")
	private String landMark;


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public Address(int id, String city, int pincode, String landMark) {
		super();
		this.addid = id;
		this.city = city;
		this.pincode = pincode;
		this.landMark = landMark;
	}

	@Override
	public String toString() {
		return "Address [id=" + addid + ", city=" + city + ", pincode=" + pincode + ", landMark=" + landMark + "]";
	}
	
	
	
}