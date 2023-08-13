package com.app.springJDBC_1stProject;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import studentService.DAO.EmployeeServiceImpl;

public class App {
	static Scanner sc = new Scanner(System.in);
	static int ch;

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("SpringJDBC.xml");
		EmployeeServiceImpl bean = apc.getBean("EmployeeServiceImpl", EmployeeServiceImpl.class);
		((AbstractApplicationContext) apc).close();

		while (ch == 0) {
			System.out.println("1. \n2. \n3. \n4. \n5. \n6. \n7. \n8. \n9.");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				bean.createTable();
				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:

				break;

			case 9:

				break;

			default:
				break;
			}
		}

	}
}