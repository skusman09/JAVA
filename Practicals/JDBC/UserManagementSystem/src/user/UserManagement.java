package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcConnection.JDBC;

// CRUD Application
// (CREATE, READ, UPDATE, DELETE)

// UserManagement Class
public class UserManagement {
	// Instance Variables
	static Connection con = null;
	static PreparedStatement ps = null;

//	01-> Create Table
	// Method For Creating Table 'Users'
	public static void createTable() {
		try {
			// Invoking Jdbc Connection From JDBC Class
			con = JDBC.getcon();
			// Creating Statement For Executing The Mysql Query
			Statement s = con.createStatement();
			// Storing Mysql Query In 'query' Variable
			String query = "CREATE TABLE IF NOT EXISTS users (uname VARCHAR(20) PRIMARY KEY, password VARCHAR(20) NOT NULL CHECK (LENGTH(password) >= 6))";
			boolean result = s.execute(query);

			if (!result) { // The Condition Show That Users Created Or Not
				System.out.println("USER CREATED SUCCESSFULLY");
			} else {
				System.err.println("USER NOT CREATED");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	02-> Create User
	// Method For Create Users
	public static void createUser(String uname, String password) {
		try {
			// Invoking Jdbc Connection From JDBC Class
			con = JDBC.getcon();
			// Creating PrepareStatement For Dynamic Query
			ps = con.prepareStatement("INSERT INTO Users (uname, password) VALUES(?,?)");
			// Set The uname and password
			ps.setString(1, uname);
			ps.setString(2, password);
			int result = ps.executeUpdate(); // Executing Query
			if (result > 0) { // The Condition Show That Users Created Or Not
				System.out.println(result + " User Created Successfully...!");
			} else {
				System.err.println("User Not Created");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	03-> Update Password
	// Method For Updating Password
	public static void updatePassword(String uname, String password) {
		try {
			// Invoking Connection From JDBC Class
			con = JDBC.getcon();
			// Creating PrepareStatement For Dynamic Query
			ps = con.prepareStatement("UPDATE users SET password = ? WHERE uname = ?");
			// Set uname and password
			ps.setString(1, password);
			ps.setString(2, uname);
			// Executing Query
			int res = ps.executeUpdate();
			// The Condition Show That password Updated Or Not
			if (res > 0) {
				System.out.println("Password Updated Successfully");
			} else {
				System.err.println("Password Not Updated");
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	04-> Delete Record
	// Method For Deleting A Users
	public static void deleteData(String uname) {
		try {
			// Invoking Jdbc Connection From JDBC Class
			con = JDBC.getcon();
			// Creating PrepareStatement For Dynamic Query
			ps = con.prepareStatement("DELETE FROM users WHERE uname = ?");
			// Set uname
			ps.setString(1, uname);
			// Executing Query
			int res = ps.executeUpdate();
			// The Condition Show That User Deleted Or Not
			if (res >= 1) {
				System.out.println("Deleted Successfully");
			} else {
				System.err.println("User Not Deleted");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	05-> Retrieve a User
	// Method For Retriving User
	public static void retrieveUser(String uname) {
		try {
			// Invoking Jdbc Connection From JDBC Class
			con = JDBC.getcon();
			// Creating PrepareStatement For Dynamic Query
			ps = con.prepareStatement("SELECT * FROM users WHERE uname = ?");
			// Set uname
			ps.setString(1, uname);
			// Executing Query
			ResultSet res = ps.executeQuery();
			if (res.next()) { // The Condition Show That User Found Or Not
				do {
					System.out.println(res.getString(1) + "\t" + res.getString(2));
				} while (res.next());
			} else {
				System.out.println("Not Found");
			}
			con.close();
		} catch (

		SQLException e) {
			e.printStackTrace();
		}

	}

//	06-> List Of All User
	public static void listUser() {
		try {
			// Invoking Jdbc Connection From JDBC Class
			con = JDBC.getcon();
			// Creating PrepareStatement For Dynamic Query
			ps = con.prepareStatement("SELECT * FROM Users");
			// Executing Query
			ResultSet res = ps.executeQuery();
			while (res.next()) { // Loop For Tarverse Users
				System.out.println(res.getString(1) + "\t" + res.getString(2));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
