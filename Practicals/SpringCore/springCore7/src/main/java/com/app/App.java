package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("config.xml");

		Mobile obj1 = apc.getBean("mob1", Mobile.class);
		obj1.showMobile();
	}
}
