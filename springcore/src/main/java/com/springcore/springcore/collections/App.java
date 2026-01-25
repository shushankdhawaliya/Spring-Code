package com.springcore.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/collections/Config.xml");
         Test test = (Test)context.getBean("test");
        System.out.println(test);
    }
}
