package com.app.springCore8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("config.xml");

//		College colg = apc.getBean("college", College.class);
		College colg = apc.getBean("colg", College.class);
		System.out.println(colg);

//		Library lib = apc.getBean("library", Library.class);
		Library lib = apc.getBean("lbry", Library.class);
		System.out.println(lib);

//		Laboratory lab = apc.getBean("laboratory", Laboratory.class);
		Laboratory lab = apc.getBean("lab", Laboratory.class);
		System.out.println(lab);

		((AbstractApplicationContext) apc).close();
	}
}
