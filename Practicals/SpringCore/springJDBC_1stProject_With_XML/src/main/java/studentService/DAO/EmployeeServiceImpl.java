package studentService.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Employee;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private JdbcTemplate jdbcTemplate;

	public void createTable() {
		String query = "CREATE TABLE IF NOT EXISTS Employer (empID int primary key, empName varchar(50) not null, empDepartment varchar(50) not null)";
		jdbcTemplate.execute(query);
		System.out.println("Table Created...");
	}

	public Employee insertRecord(Employee emp) {
		
		return null;
	}

	public List<Employee> showAllRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteRecord() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int searchByID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String searchByName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee updateRecord() {
		// TODO Auto-generated method stub
		return null;
	}

}