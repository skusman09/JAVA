package com.app.springORM_1stProject;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Employee.Service.DAO.EmployeeService;
import Employee.Service.DAO.EmployeeServiceImpl;
import model.Employee.Employee;

public class App {
	static Scanner sc = new Scanner(System.in);

	static int ch;

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("config.xml");
		EmployeeService bean = apc.getBean("employeeService", EmployeeServiceImpl.class);

		while (true) {
			System.out.println(
					"01. Add New Record \n02. Update Record \n03. Delete Record \n04. Search By ID \n05. Search By Name \n06. Showing All Employee \n 07. Delete All Record \n08. Exit \n~Enter Any Options~");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Employer ID");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employer Name");
				String name = sc.nextLine();
				System.out.println("Enter Employer Address");
				String address = sc.nextLine();
				Employee emp = new Employee(id, name, address);
				bean.addRecord(emp);
				System.out.println("Record Added...");
				break;

			case 2:
				System.out.println("Enter Existing ID To Update Record");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Update Your Name");
				name = sc.nextLine();
				System.out.println("Update Your Address");
				address = sc.nextLine();
				emp = new Employee(id, name, address);
				bean.updateRecord(emp);
				break;

			case 3:
				System.out.println("Enter Existing ID To Delete Record");
				id = sc.nextInt();
				bean.deleteRecord(id);
				break;

			case 4:
				System.out.println("Enter An Employee ID To Get Information");
				id = sc.nextInt();
				bean.searchByID(id);
				break;

			case 5:
				System.out.println("Enter An Employee Name To Get Information");
				name = sc.nextLine();
				bean.searchByName(name);
				break;

			case 6:
				System.out.println("Showing All Employee Information");
				int count = 1;
				List<Employee> showAllRecord = bean.showAllRecord();
				for (Employee employee : showAllRecord) {
					System.out.print("Employee " + (count++) + ": ");
					System.out.println(employee);
				}
				break;

			case 7:
				bean.deleteAll();
				break;

			case 8:
				System.out.println("Thank You... \n\t ~Visit Again");
				System.exit(ch);
				break;

			default:
				System.out.println("Wrong Input...!");
				break;
			}
		}
	}
}
