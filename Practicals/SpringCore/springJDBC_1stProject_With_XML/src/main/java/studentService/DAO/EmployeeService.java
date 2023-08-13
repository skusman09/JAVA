package studentService.DAO;

import java.util.List;

import model.Employee;

public interface EmployeeService {
//	01.
	public void createTable();

//	02.
	public Employee insertRecord(Employee emp);

//	03.
	public Employee updateRecord();

//	04.
	public List<Employee> showAllRecord();

//	05.
	public int deleteRecord();

//	06.
	public int searchByID();

//	07.
	public String searchByName();
}