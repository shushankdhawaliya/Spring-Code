package com.springcore.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext  context  =  new ClassPathXmlApplicationContext("com/springcore/springcore/autowire/annotation/Config.xml");
		Student st =  (Student) context.getBean("student");
		System.out.print(st);
	}
}
