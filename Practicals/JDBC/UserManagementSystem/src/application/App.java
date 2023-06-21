package application;

import java.util.Scanner;

import user.UserManagement;

public class App {
	// Static Scanner
	static Scanner sc = new Scanner(System.in);

	// Creating Crud Method
	public static void crud() {
		// Local Vaiable
		int ch = 0;
		do { // Using DoWhile-Loop
			// Displaying The Options
			System.out.println(
					"1. Create a User\n2. Update Password \n3. Delete a User \n4. Retrieve a User \n5. List of all User \n6. EXIT");

			System.out.println("ENTER YOUR CHOICE:");
			ch = sc.nextInt();

			// Using SwitchCase
			switch (ch) {
			case 1:
				System.out.println("Creating User...");
				// For Creating Table Invoking 'createTable' Method From 'UserManagement' Class
				UserManagement.createTable();

				System.out.println("Enter Your Username");
				String uname = sc.nextLine(); // Taking Value From The User
				sc.nextLine(); // For Next Line
				System.out.println("Enter Your Password");
				String password = sc.nextLine(); // Taking Value From The User
				// For Creating User Invoking 'createUser' Method From 'UserManagement' Class
				UserManagement.createUser(uname, password);
				break; // Breaking Case 1

			case 2:
				System.out.println("Enter Username Whose Password To Be Updated.");
				uname = sc.nextLine(); // Taking Value From The User
				sc.nextLine(); // For Next Line
				System.out.println("Enter your New Password");
				password = sc.nextLine(); // Taking Value From The User
				// For Updating User's Password Invoking 'updatePassword' Method From
				// 'UserManagement' Class
				UserManagement.updatePassword(uname, password);
				break; // Breaking Case 2

			case 3:
				System.out.println("Delete Users");
				uname = sc.nextLine();
				sc.nextLine();
				UserManagement.deleteData(uname);
				break; // Breaking Case 3

			case 4:
				System.out.println("Retrieve Users");
				String retrieve = sc.nextLine();
				UserManagement.retrieveUser(retrieve);
				break; // Breaking Case 4

			case 5:
				UserManagement.listUser();
				break; // Breaking Case 5

			case 6:
				System.out.println("Thank You, Visit Again...!");
				System.exit(ch); // Exit From The Program
				break;

			default:
				System.out.println("Wrong Input");
				break; // Breaking Default
			}
		} while (true); // Infinit Loop

	}

	public static void main(String[] args) {
		crud(); // Invoking 'crud' Method From 'App' Class
	}
}
