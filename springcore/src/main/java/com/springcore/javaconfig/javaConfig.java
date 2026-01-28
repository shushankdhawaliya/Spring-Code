package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.springcore.javaconfig")
public class javaConfig {
	@Bean
	public Friend getFriend(){
		return new Friend();
	}
	@Bean
	public Person getPerson() {
		Person per = new Person();
		return per;
	}
}
