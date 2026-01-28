package com.springcore.springcore.spel;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
	@Value("#{12+33}")
	private int x;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int y;
	@Value("#{T(java.lang.Math).E}")
	private int z;
	@Value("#{25>12}")
	private boolean flag;
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", z=" + z + ", flag=" + flag + "]";
	}
	
	
}
