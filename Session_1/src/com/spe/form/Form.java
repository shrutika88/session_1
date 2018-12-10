package com.spe.form;

import java.util.Calendar;

import com.spe.address.Address;

public class Form {
	private String name;
	private Calendar dob;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getDob() {
		return dob;
	}
	public void setDob(Calendar dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Form(String name, Calendar dob, Address address) {
		super();
		this.name = name;
		this.dob = dob;

		this.address = address;
	}
	public Form() {
		super();
	}
	@Override
	public String toString() {
		return "Form [name=" + name + ", dob=" + dob +  ", address=" + address + "]";
	}
	
	
}
