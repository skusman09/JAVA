package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App2 {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root",
					"usman@dbms@sql");

			String query = "CREATE TABLE Marks (std_Name varchar(20) not null, sem1 int not null, sem2 int not null)";

			// Using PreparedStatement
			PreparedStatement prepStmnt = con.prepareStatement(query);

			boolean res = prepStmnt.execute();

			if (!res) {
				System.out.println("Table Created Successfully");
			} else {
				System.out.println("Table Not Created");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
