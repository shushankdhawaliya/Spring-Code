package com.springcore.springcore.collections;
import java.util.List;
import java.util.Set;
import  java.util.Map;
import java.util.Properties;

public class Test 	{
	public List<Integer> list;
	public String name;
	public int id;
	public Set set;
	public Map<Integer,String>   map;
	public Properties pro;
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public Map getMap() {
		return map;
	}
	
	public Test(List<Integer> list, String name, int id, Set set, Map<Integer, String> map, Properties pro) {
		super();
		this.list = list;
		this.name = name;
		this.id = id;
		this.set = set;
		this.map = map;
		this.pro = pro;
	}
	public Test(List<Integer> list, String name, int id, Set set, Map map) {
		super();
		this.list = list;
		this.name = name;
		this.id = id;
		this.set = set;
		this.map = map;
	}
	public Test(List<Integer> list, String name, int id, Set set) {
		super();
		this.list = list;
		this.name = name;
		this.id = id;
		this.set = set;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Test(List<Integer> list, String name, int id) {
		super();
		this.list = list;
		this.name = name;
		this.id = id;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Test [list=" + list + ", name=" + name + ", id=" + id + ", set=" + set + ", map=" + map + ", pro=" + pro
				+ "]";
	}
	
}
