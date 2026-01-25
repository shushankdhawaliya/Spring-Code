package com.springcore.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext  context  =  new ClassPathXmlApplicationContext("com/springcore/springcore/ref/Config.xml");
		Detail det =  (Detail) context.getBean("detail");
		System.out.print(det);
	}
}
