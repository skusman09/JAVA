package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import company.Employee;

public class App {
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("config.xml");

		Employee obj1 = apc.getBean("emp1", Employee.class);
		obj1.showEmployee();

		System.out.println("\n--------------------------------\n");

		Employee obj2 = apc.getBean("emp2", Employee.class);
		obj2.showEmployee();

//		System.out.println(obj1);
	}
}
