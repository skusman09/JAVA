package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("config.xml");
//		Mobile ob1 = apc.getBean("mob1", Mobile.class);
//		System.out.println("iPhone Specification \n" + ob1 + "\n");
//
//		Mobile ob2 = apc.getBean("mob2", Mobile.class);
//		System.out.println("Samsung Specification \n" + ob2 + "\n");

		Mobile ob3 = apc.getBean("mob3", Mobile.class);
		System.out.println(ob3);
	}
}
