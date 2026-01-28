package com.springcore.springcore.standlone.collections;
import java.util.List;
import java.util.Set;
import  java.util.Map;
import java.util.Properties;

public class Test 	{
	private List<Integer> list;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Test(List<Integer> list) {
		super();
		this.list = list;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Test [list=" + list + "]";
	}
	
}
