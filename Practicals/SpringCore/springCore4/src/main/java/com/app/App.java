package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import emp.Employee;
import mobileSim.Mobile;
import mobileSim.Sim;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("config.xml");

//		Employee Class
		Employee obj1 = apc.getBean("emp1", Employee.class);
		Employee obj2 = apc.getBean("emp2", Employee.class);
		System.out.println("Employees Details");
		System.out.println(obj1);
		System.out.println(obj2);

//		Mobile Class
		System.out.println("\nMobile And Sim Details");
		Mobile mobObj1 = apc.getBean("mob1", Mobile.class);
		System.out.println(mobObj1);

	}
}
