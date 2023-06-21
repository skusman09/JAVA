package com.app.Lab12;

import java.text.ParseException;
import java.util.Scanner;

import dao.StudentsDao;
import model.Student;

// Main Class
public class App {
	static Scanner sc = new Scanner(System.in); // Scanner Class For Get Value From User
	static int ch = 0;

	public static void operation() {
		do {
			System.out.println(
					"1. Add Student \n2. See Student Detail \n3. Delete a Student \n4. Update student details \n5. Show All Student Record \n6. Search Student By Name \n7. EXIT \nENTER GIVEN OPTION:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Your ID");
				int id = sc.nextInt(); 
				sc.nextLine();

				System.out.println("Enter Your Name");
				String name = sc.nextLine();

				System.out.println("Enter Your Contact");
				String contact = sc.nextLine();

				Student st = new Student(id, name, contact);
				StudentsDao.insertStudent(st);
				break;

			case 2:
				System.out.println("Enter Id For Get Student Record");
				id = sc.nextInt();
				StudentsDao.getStudent(id);
				break;

			case 3:
				System.out.println("Enter Student ID For Deleting Student");
				id = sc.nextInt();
				StudentsDao.deleteStudent(id);
				break;

			case 4:
				System.out.println("Enter Student Id For Updating Student");
				id = sc.nextInt();

				System.out.println("Update Your Name");
				name = sc.nextLine();
				sc.nextLine();

				System.out.println("Update Your Contact");
				contact = sc.nextLine();

				st = new Student(id, name, contact);
				StudentsDao.updateStudent(st);
				break;

			case 5:
				StudentsDao.allStudentRecords();
				break;

			case 6:
				System.out.println("Enter Student Name For Searching Student");
				sc.nextLine();
				name = sc.nextLine();
				StudentsDao.searchStudentByName(name);
				break;

			case 7:
				System.out.println("Thanks For Using Student App...!\n\t\t~VISIT AGAIN");
				System.exit(ch);
				break;

			default:
				System.err.println("WRONG INPUT");
				break;
			}
		} while (true);
	}

	public static void main(String[] args) throws ParseException {
		operation();
	}
}
