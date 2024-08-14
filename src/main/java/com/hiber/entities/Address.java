package com.hiber.entities;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "student_address")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Address_Id")
	private int addressid;
	
	@Column(name = "STREET")
	private String street;
	
	@Column(length = 50,name = "CITY")
	private String city;
	@Column(name = "is_open")
	private Boolean isOpen;
	@Transient
	private double x;
	@Column(name = "added_date")
      @Temporal(TemporalType.DATE)
	private Date addedDate;
	@Lob
    private byte[] image;
	
	@Column(name = "opening_time")
	@Temporal(TemporalType.TIME)
	private Date O_time;
	
	@Column(name = "closing_time")
	@Temporal(TemporalType.TIME)
	private Date C_time;

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getO_time() {
		return O_time;
	}

	public void setO_time(Date o_time) {
		O_time = o_time;
	}

	public Date getC_time() {
		return C_time;
	}

	public void setC_time(Date c_time) {
		C_time = c_time;
	}

	public Address(int addressid, String street, String city, Boolean isOpen, double x, Date addedDate, byte[] image,
			Date o_time, Date c_time) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
		O_time = o_time;
		C_time = c_time;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + ", O_time=" + O_time
				+ ", C_time=" + C_time + "]";
	}
	
	




	
	
	
	

}
