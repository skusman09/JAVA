package com.app.springJDBC_3rdProject_HW;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import model.Student;
import model.JdbcConfig;
import studentService.DAO.StudentService_Impl;

public class App {
	static int ch;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ApplicationContext apc = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentService_Impl beans = apc.getBean("studentService", StudentService_Impl.class);
		((AbstractApplicationContext) apc).close();

		while (true) {
			System.out.println(
					"01. Create Table \n02. Add Record \n03. Update Record \n04. Delete Record By Id \n05. Search By ID \n06. Search By Name \n07. Show All Records \n08. Clear Table Records \n09. Exit");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Creating Table....");
				beans.createTable();
				break;

			case 2:
				System.out.println("Inserting Record....");
				System.out.println("Enter ID");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name");
				String name = sc.nextLine();
				System.out.println("Enter Course");
				String course = sc.nextLine();
				Student std = new Student(id, name, course);
				beans.insertByOne(std);
				break;

			case 3:
				System.out.println("Enter ID That You Want To Update");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name");
				name = sc.nextLine();
				System.out.println("Enter Course");
				course = sc.nextLine();
				std = new Student(id, name, course);

				int updateRecord = beans.updateRecord(std);
				if (updateRecord >= 1) {
					System.out.println(updateRecord + " Record Updated");
				} else {
					System.out.println("Record Not Updated");
				}
				break;

			case 4:
				System.out.println("Enter ID That You Want To Delete Record");
				id = sc.nextInt();
				beans.deleteById(id);
				break;

			case 5:
				System.out.println("Enter ID For Getting Student");
				id = sc.nextInt();
				beans.searchByID(id);
				break;

			case 6:
				System.out.println("Enter Name For Getting Student");
				sc.nextLine();
				name = sc.nextLine();
				beans.searchByName(name);
				break;

			case 7:
				beans.showAll();
				break;

			case 8:
				beans.clearAll();
				break;

			case 9:
				System.out.println("Thank You \n\t ~~Visit Again \n========================");
				System.exit(ch);
				break;

			default:
				System.err.println("Invalid Choice \n");
				break;
			}
		}
	}
}