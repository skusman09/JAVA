package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {
//	Step 2 ->
		try {
//			step 02
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root",
					"usman@dbms@sql");
			
//			step 03
			Statement statement = con.createStatement();

//			step 04
			ResultSet res = statement.executeQuery("select * from department");

//			step 05
			while (res.next()) {
				System.out.println(res.getString(1) + "\t" + res.getString(2) + "\t\t" + res.getString(3));
			}
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
