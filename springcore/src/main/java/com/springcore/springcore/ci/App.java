package com.springcore.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext  context  =  new ClassPathXmlApplicationContext("com/springcore/springcore/ci/Config.xml");
		Person per =  (Person) context.getBean("person");
		System.out.print(per);
	}
}
