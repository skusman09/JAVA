package application;

import java.util.Scanner;

import user.UserManagement;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static void crud() {
		int ch = 0;
		do {
			System.out.println(
					"1. Create a User\n2. Update Password \n3. Delete a User \n4. Retrieve a User \n5. List of all User \n6. EXIT");

			System.out.println("ENTER YOUR CHOICE:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Creating User...");
				UserManagement.createTable();

				System.out.println("Enter Your Username");
				String uname = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Your Password");
				String password = sc.nextLine();
				UserManagement.createUser(uname, password);
				break;

			case 2:
				System.out.println("Enter your Username To Update Password");
				uname = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter your New Password");
				password = sc.nextLine();
				UserManagement.updatePassword(uname, password);
				break;

			case 3:
				System.out.println("Delete Users");
				uname = sc.nextLine();
				sc.nextLine();
				UserManagement.deleteData(uname);
				break;

			case 4:
				System.out.println("Retrieve Users");
				String retrieve = sc.nextLine();
				UserManagement.retrieveUser(retrieve);
				break;

			case 5:
				UserManagement.listUser();
				break;

			case 6:
				System.out.println("Thank You, Visit Again...!");
				System.exit(ch);

			default:
				System.out.println("Wrong Input");
				break;
			}
		} while (ch != 0);

	}

	public static void main(String[] args) {
		crud();
	}
}
