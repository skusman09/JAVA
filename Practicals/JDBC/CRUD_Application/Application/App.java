package Application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
		try {
			Connection c = JDBC.getcon();

			Statement s = c.createStatement();
			boolean res = s.execute("CREATE TABLE book(col1 int, col2 int)");
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
