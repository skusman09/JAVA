package Employee.Service.DAO;

import java.util.List;

import model.Employee.Employee;

public interface EmployeeService {

//	01. Insert Record
	public void addRecord(Employee emp);

//	02. Update Record
	public Employee updateRecord(Employee emp);

//	03. Delete Record
	public int deleteRecord(int id);

//	04. Search By ID
	public int searchByID(int id);

//	05. Search By Name
	public String searchByName(String name);

//	06. Showing All Employee
	public List<Employee> showAllRecord();

//	07. Delete All Record
	public void deleteAll();

}
