package com.spe.address;

public class Address {
	private String addr1;
	private String addr2;
	private String addr3;
	private double pincode;
	public double getPincode() {
		return pincode;
	}
	public void setPincode(double pincode) {
		this.pincode = pincode;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getAddr3() {
		return addr3;
	}
	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}
	public Address(String addr1, String addr2, String addr3,double d) {
		super();
		this.pincode = d ;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
	}
	public Address(){
	}
	@Override
	public String toString() {
		return "Address [addr1=" + addr1 + ", addr2=" + addr2 + ", addr3="
				+ addr3 + ", pincode=" + pincode + "]";
	}
	
	
}
