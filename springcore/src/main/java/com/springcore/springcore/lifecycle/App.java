package com.springcore.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
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
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/lifecycle/Config.xml");
         Defender def = (Defender)context.getBean("defender");
         context.registerShutdownHook();
        System.out.println(def);
       
    }
}
