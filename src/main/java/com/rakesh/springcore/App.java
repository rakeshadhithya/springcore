package com.rakesh.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String args[]) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//though same class, two beans are registered with different names

		//this bean is registerd with name product1 and constructor injection in the ApplicationContext.xml
		Product product1 = (Product) factory.getBean("product1");
		System.out.println(product1.getProduct());
		
		//this bean is registerd with name product2 and setter injection in the ApplicationContext.xml
		Product product2 = (Product) factory.getBean("product2");
		System.out.println(product2.getProduct());
		
	}
}
