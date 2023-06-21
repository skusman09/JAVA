package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Creating DB Connection
public class JDBC { // JDBC Class
	// Instance Variables
	static private String url = "jdbc:mysql://localhost:3306/company"; // MySql DataBase url
	static private String urname = "root"; // Mysql Username
	static private String password = "usman@dbms@sql"; // Mysql Password

	// Static Method getcon() Which Returns The Connection
	public static Connection getcon() throws SQLException {
		Connection con = DriverManager.getConnection(url, urname, password);
		return con;
	}
}
