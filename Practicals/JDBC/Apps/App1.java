import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App1 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root",
                    "usman@dbms@sql");

            Statement statement = con.createStatement();
            String query = "Select * from department";

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t    " + rs.getString(3));
            }

            System.out.println(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}