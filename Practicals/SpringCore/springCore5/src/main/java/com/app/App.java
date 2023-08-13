package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Mobile_Sim.Mobile;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext apc = new ClassPathXmlApplicationContext("config.xml");
		Mobile mobObj = apc.getBean("mob1", Mobile.class);
		mobObj.showMobileDetails();
	}
}
