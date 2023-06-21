package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
	static private String url = "jdbc:mysql://localhost:3306/company";
	static private String urname = "root";
	static private String password = "usman@dbms@sql";

	public static Connection getcon() throws SQLException {
		Connection con = DriverManager.getConnection(url, urname, password);
		return con;
	}
}
