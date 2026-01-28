package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext  context  =  new AnnotationConfigApplicationContext(javaConfig.class);
		Person per =  (Person) context.getBean("getPerson");
		System.out.print(per);
	}
}
