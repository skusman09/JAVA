package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("Config.xml");
		SBI sbiObj1 = apc.getBean("sbi1", SBI.class);
		BOB bobObj1 = apc.getBean("bob1", BOB.class);

		sbiObj1.debit();
		sbiObj1.credit();
		bobObj1.debit();
		bobObj1.credit();

		System.out.println("\n***With Interface***");
		RBI sbiObj2 = apc.getBean("sbi2", RBI.class);
		RBI bobObj2 = apc.getBean("bob2", RBI.class);
		
		sbiObj2.debit();
		sbiObj2.credit();
		bobObj2.debit();
		bobObj2.credit();

		System.out.println(apc);
	}
}
