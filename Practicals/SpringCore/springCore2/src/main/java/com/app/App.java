package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("config.xml");
		Vi vi = apc.getBean("vi", Vi.class);
		vi.calling();
		vi.internet();

		Airtel air = apc.getBean("airtel", Airtel.class);
		air.calling();
		air.internet();

		System.out.println("\nWith Inteface");
		Sim ob = apc.getBean("xyz", Sim.class);
		ob.calling();
		ob.internet();

		System.out.println(apc);
	}
}
