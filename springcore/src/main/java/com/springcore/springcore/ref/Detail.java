package com.springcore.springcore.ref;

public class Detail {
	public String address;
	public  B  ob;
	
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public Detail(String address, B ob) {
		super();
		this.address = address;
		this.ob = ob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [name=" + address + ", ob=" + ob + "]";
	}
	
}
