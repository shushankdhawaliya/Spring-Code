package com.springcore.springcore.ref;

public class B {
	private  String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public B(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "B [name=" + name + ", age=" + age + "]";
	}
	
}
