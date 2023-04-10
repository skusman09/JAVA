package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App1 {
	public static void main(String[] args) {
		try {
			// step 01
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root",
					"usman@dbms@sql");

			// step 02
			Statement statement = con.createStatement();

			String query = "CREATE TABLE ShopKeeperannas(ID int, Name varchar(20))";
			boolean res = statement.execute(query);

			if (!res) {
				System.out.println("CREATED");
			} else {
				System.out.println("NOT CREATED");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
