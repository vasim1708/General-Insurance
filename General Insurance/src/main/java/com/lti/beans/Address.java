package com.lti.beans;

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
	//@SequenceGenerator(name = "AddrSeq", initialValue = 1, allocationSize=1)
	//@GeneratedValue
	@Column(name="AddrId",length=10)
	private int addid;
	
	@Column(name = "City",length = 20)
	private String city;
	
	@Column(name = "Pincode",length = 20)
	private int pincode;
	
	@Column(name = "LandMark",length = 20)
	private String landMark;

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

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

	public Address(int addid, String city, int pincode, String landMark) {
		super();
		this.addid = addid;
		this.city = city;
		this.pincode = pincode;
		this.landMark = landMark;
	}

	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + ", pincode=" + pincode + ", landMark=" + landMark + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}