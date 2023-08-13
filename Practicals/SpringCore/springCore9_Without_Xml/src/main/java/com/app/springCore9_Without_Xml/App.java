package com.app.springCore9_Without_Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new AnnotationConfigApplicationContext(SpringConfig1.class);

//		College colg = apc.getBean("college", College.class);
		College colg = apc.getBean("colg", College.class);
		System.out.println(colg);
		colg.temp();

//		Library lib = apc.getBean("library", Library.class);
		Library lib = apc.getBean("lbry", Library.class);
		System.out.println(lib);
		lib.temp();

//		Laboratory lab = apc.getBean("laboratory", Laboratory.class);
		Laboratory lab = apc.getBean("lab", Laboratory.class);
		System.out.println(lab);
		lab.temp();

		((AbstractApplicationContext) apc).close();
	}

}
