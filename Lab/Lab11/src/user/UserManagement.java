package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcConnection.JDBC;

// CRUD Application
// (CREATE, READ, UPDATE, DELETE)

public class UserManagement {
	static Connection con = null;
	static PreparedStatement ps = null;

//	01-> Create Table
	public static void createTable() {
		try {
			con = JDBC.getcon();
			Statement s = con.createStatement();

			String query = "CREATE TABLE IF NOT EXISTS users (uname VARCHAR(50) PRIMARY KEY, password VARCHAR(50) NOT NULL CHECK (LENGTH(password) >= 6))";
			boolean result = s.execute(query);

			if (!result) {
				System.out.println("USER CREATED SUCCESSFULLY");
			} else {
				System.err.println("USER NOT CREATED");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	02-> Create User
	public static void createUser(String uname, String password) {
		try {
			con = JDBC.getcon();

			ps = con.prepareStatement("INSERT INTO Users (uname, password) VALUES(?,?)");
			ps.setString(1, uname);
			ps.setString(2, password);
			int result = ps.executeUpdate();
			if (result >= 1) {
				System.out.println(result + " Record Added Successfuly");
			} else {
				System.err.println("Record Not Added");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	03-> Update Password
	public static void updatePassword(String uname, String password) {
		try {
			con = JDBC.getcon();
			ps = con.prepareStatement("UPDATE users SET password = ? WHERE uname = ?");

			ps.setString(1, password);
			ps.setString(2, uname);

			int res = ps.executeUpdate();

			if (res >= 1) {
				System.out.println("Updated Successfully");
			} else {
				System.err.println("Not Updated");
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	04-> Delete Record
	public static void deleteData(String uname) {
		try {
			con = JDBC.getcon();

			ps = con.prepareStatement("DELETE FROM users WHERE uname = ?");
			ps.setString(1, uname);

			int res = ps.executeUpdate();

			if (res >= 1) {
				System.out.println("Deleted Successfully");
			} else {
				System.err.println("Not Delete");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	05-> Retrieve a User
	public static void retrieveUser(String uname) {
		try {
			con = JDBC.getcon();

			ps = con.prepareStatement("SELECT * FROM users WHERE uname = ?");
			ps.setString(1, uname);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
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
			con = JDBC.getcon();
			ps = con.prepareStatement("SELECT * FROM Users");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				System.out.println(res.getString(1) + "\t" + res.getString(2));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
