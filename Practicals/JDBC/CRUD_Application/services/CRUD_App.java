package services;

import java.util.Scanner;

class CRUD_App {
	static Scanner sc = new Scanner(System.in);

	public static void check() {
		System.out.println("Enter Username");
		String username = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		Employee.admin(username, password);
	}

	public static void crud() {
		int ch = 0;
		do {
			System.out.println(
					"1. Create Table\n2. Add Record \n3. Search Record By Id \n4. Search Record By Name \n5. Update Record \n6. Delete Record \n7. Show All Record \n8. EXIT");

			System.out.println("ENTER YOUR CHOICE:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				Employee.createTable();
				break;

			case 2:
				System.out.println("Enter Your Id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Your Name");
				String name = sc.nextLine();
				System.out.println("Enter Your Contact");
				String contact = sc.nextLine();
				System.out.println("Enter Your Email");
				String email = sc.nextLine();
				Employee.insertData(id, name, contact, email);
				break;

			case 3:
				System.out.println("Search By Id");
				int searchId = sc.nextInt();
				Employee.retrieveData(searchId);
				break;

			case 4:
				System.out.println("Serach By Name");
				sc.nextLine();
				String searchName = sc.nextLine();
				Employee.retrieveName(searchName);
				break;

			case 5:
				System.out.println("Enter your Previous ID For Update Record");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your New Name");
				name = sc.nextLine();
				System.out.println("Enter your New Contact");
				contact = sc.nextLine();
				System.out.println("Enter your New Email");
				email = sc.nextLine();
				Employee.updateRec(name, contact, email, id);
				break;

			case 6:
				System.out.println("Enter ID");
				id = sc.nextInt();
				Employee.deleteData(id);
				break;

			case 7:
				Employee.showAllRec();
				break;

			default:
				System.out.println("Wrong Input");
				break;
			}
		} while (ch != 0);

	}

	public static void main(String[] args) {
		check();
	}
}
