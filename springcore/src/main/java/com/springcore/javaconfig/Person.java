package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;
//
//@Component("person")
public class Person {
	private String personName;
	private int PersonId;
	private Friend friend;
	public Friend getFriend() {
		return friend;
	}
	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonId() {
		return PersonId;
	}
	public void setPersonId(int personId) {
		PersonId = personId;
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
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", PersonId=" + PersonId + "]";
	}
	
}
