package com.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import dao.Service;
import model.Student;

public class App {
	static Scanner sc = new Scanner(System.in);
	static int ch = 0;

	public static void operation() throws ParseException {
		do {
			System.out.println(
					"\n1. Add Student Record \n2. Show Student Record \n3. Update Student Record \n4. Delete Student Record \n5. Show All Student Record \n6. Generate Random Students \n7. Delete All Students \n8. Search Using HQL \n9. Delete Using HQL \n10. EXIT \nENTER GIVEN OPTION:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Your ID");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Your Name");
				String name = sc.nextLine();

				System.out.println("Enter Your Course");
				String course = sc.nextLine();

				System.out.println("Enter Your Address");
				String add = sc.nextLine();

				System.out.println("Enter Your Age");
				int age = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Date Of Joing In dd/MM/yyyy Format");
				String date = sc.nextLine();
				SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
				Date doj = dateFormatter.parse(date);

				Student std = new Student(id, name, course, add, age, doj);
				Service.addRecord(std);
				break;

			case 2:
				System.out.println("Enter Id For Student Record");
				id = sc.nextInt();
				Service.showRecords(id);
				break;

			case 3:
				System.out.println("Enter Id For Updating Student");
				id = sc.nextInt();

				System.out.println("Update Your Name");
				sc.nextLine();
				name = sc.nextLine();

				System.out.println("Update Your Course");
				course = sc.nextLine();

				System.out.println("Update Your Address");
				add = sc.nextLine();

				System.out.println("Update Your Age");
				age = sc.nextInt();
				sc.nextLine();

				System.out.println("Update Your Date Of Joing In dd/MM/yyyy Format");
				String date1 = sc.nextLine();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date doj1 = sdf.parse(date1);

				std = new Student(id, name, course, add, age, doj1);

				Service.updateStudents(std);
				break;

			case 4:
				System.out.println("Enter Student ID For Delete");
				id = sc.nextInt();
				Service.deleteRecord(id);
				break;

			case 5:
				Service.showAllRecord();
				break;

			case 6:
				Service.generateRandomSrudents();
				break;

			case 7:
				Service.deleteAllRecord();
				break;

			case 8:
				System.out.println("Enter Name For Searching");
				sc.nextLine();
				name = sc.nextLine();
				Service.search_In_HQL(name);
				break;

			case 9:
				System.out.println("Enter Course For Deleting");
				sc.nextLine();
				course = sc.nextLine();
				Service.delete_In_HQL(course);
				break;

			case 10:
				System.out.println("Program Closed...!\n\t\t~VISIT AGAIN");
				System.exit(ch);
				break;

			default:
				System.err.println("WRONG INPUT");
				break;
			}
		} while (ch != 0);
	}

	public static void main(String[] args) throws ParseException {
		operation();
	}
}
