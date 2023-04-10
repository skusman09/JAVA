import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App2 {
    public static void main(String[] args) {
        try {
            // Create Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root",
                    "usman@dbms@sql");

            // Create Statement
            Statement statement = con.createStatement();
            String query = "Create Table salary(job_id varchar(10), emp_id int, emp_name varchar(50))";
            boolean res = statement.execute(query);
            System.out.println(res);

            String query1 = "INSERT INTO salary values('J1', 101, 'USMAN'),('J2', 102, 'UMAR'),('J3', 103, 'MAVIYAH')";
            int res1 = statement.executeUpdate(query1);
            if (res1 >= 1) {
                System.out.println(res1 + " Record Added Successfuly");
            } else {
                System.out.println("Record Not Inserted");
            }

            System.out.println(con);
            con.close(); // close connection
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
