package com.springcore.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private Details dt;

	public Details getDt() {
		return dt;
	}
	@Autowired
	public void setDt(Details dt) {
		System.out.println("Setter Method");
		this.dt = dt;
	}

	public Student(Details dt) {
		super();
		System.out.println("Default Constructor");
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
