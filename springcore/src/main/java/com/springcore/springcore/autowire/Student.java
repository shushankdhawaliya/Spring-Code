package com.springcore.springcore.autowire;

public class Student {
	private Details dt;

	public Details getDt() {
		return dt;
	}

	public void setDt(Details dt) {
		this.dt = dt;
	}

	public Student(Details dt) {
		super();
		this.dt = dt;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [dt=" + dt + "]";
	}
	
}
