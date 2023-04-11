package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Application.JDBC;

// CRUD Application
// (CREATE, READ, UPDATE, DELETE)

public class Employee {
	static Connection con = null;
	static PreparedStatement ps = null;

	// 01-> Create Table
	public static void createTable() {
		try {
			con = JDBC.getcon();
			Statement s = con.createStatement();

			String query = "CREATE TABLE Employee(empId int primary key, empName varchar(20) not null, contact varchar(10) unique , email varchar(20) not null)";
			boolean result = s.execute(query);

			if (!result) {
				System.out.println("TABLE CREATED");
			} else {
				System.err.println("TABLE NOT CREATED");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 02-> Insert Data Into Table
	public static void insertData(int empId, String empName, String contact, String email) {
		try {
			con = JDBC.getcon();
			ps = con.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?)");
			ps.setInt(1, empId);
			ps.setString(2, empName);
			ps.setString(3, contact);
			ps.setString(4, email);

			int result = ps.executeUpdate();

			if (result > 0) {
				System.out.println(result + "Record Added Successfuly");
			} else {
				System.err.println("Record Not Added");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 03-> Update Record
	public static void updateRec(String empName, String contact, String email, int empId) {
		try {
			con = JDBC.getcon();
			ps = con.prepareStatement("UPDATE Employee SET empName = ?, contact = ?, email = ? WHERE empId=?");

			ps.setString(1, empName);
			ps.setString(2, contact);
			ps.setString(3, email);
			ps.setInt(4, empId);

			int res = ps.executeUpdate();

			if (res >= 1) {
				System.out.println("Record Updated Successfully");
			} else {
				System.err.println("Record Not Updated");
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 04-> Delete Record
	public static void deleteData(int empId) {
		try {
			con = JDBC.getcon();

			ps = con.prepareStatement("DELETE FROM Employee WHERE empId = ?");
			ps.setInt(1, empId);

			int res = ps.executeUpdate();

			if (res >= 1) {
				System.out.println("Record Deleted Successfully");
			} else {
				System.err.println("Record Not Delete");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 05-> Retrieve(READ) Data By ID
	public static void retrieveData(int empId) {
		try {
			con = JDBC.getcon();

			ps = con.prepareStatement("SELECT * FROM Employee WHERE empId = ?");
			ps.setInt(1, empId);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				do {
					System.out.println(res.getInt(1) + "\t" + res.getString(2) + "\t" + res.getString(3) + "\t"
							+ res.getString(4));
				} while (res.next());
			} else {
				System.out.println("Record Not Found");
			}

			con.close();
		} catch (

		SQLException e) {
			e.printStackTrace();
		}

	}

	// 06-> Retrieve Data By Name
	public static void retrieveName(String empName) {
		try {
			con = JDBC.getcon();

			ps = con.prepareStatement("SELECT * FROM Employee WHERE empName = ?");
			ps.setString(1, empName);

			ResultSet res = ps.executeQuery();

			if (res.next()) {
				do {
					System.out.println(res.getInt(1) + "\t" + res.getString(2) + "\t" + res.getString(3) + "\t"
							+ res.getString(4));
				} while (res.next());
			} else {
				System.out.println("Record Not Found");
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 07-> Show All Record
	public static void showAllRec() {
		try {
			con = JDBC.getcon();
			ps = con.prepareStatement("SELECT * FROM Employee");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				System.out.println(
						res.getInt(1) + "\t" + res.getString(2) + "\t" + res.getString(3) + "\t" + res.getString(4));
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void admin(String userName, String password) {
		try {
			con = JDBC.getcon();
			ps = con.prepareStatement("SELECT * FROM admin");
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				if (res.getString(1).equals(userName) && res.getString(2).equals(password)) {
					System.out.println("Username And Password Matched");
					CRUD_App.crud();

				} else {
					System.out.println("Username And Password Doesn't Matched");
				}
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
