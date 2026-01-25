package com.springcore.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Defender implements InitializingBean,DisposableBean{
	private String name;
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Defender(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Defender [name=" + name + ", price=" + price + "]";
	}
	public Defender() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void start() {
		System.out.println("start method");
	}
	@PreDestroy
	public void end() {
		System.out.println("End Method");
	}
	public void destroy() {
		System.out.println("2nd Method");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("1st Method");
	}
}
