package com.springcore.springcore.ci;

public class Person {
	private String personName;
	private int PersonId;
	private Certi cer;
	public Person(Certi cer) {
		super();
		this.cer = cer;
	}
	public Person(String personName, int personId) {
		super();
		this.personName = personName;
		PersonId = personId;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, int personId, Certi cer) {
		super();
		this.personName = personName;
		PersonId = personId;
		this.cer = cer;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", PersonId=" + PersonId + ", cer=" + cer + "]";
	}
	
}
