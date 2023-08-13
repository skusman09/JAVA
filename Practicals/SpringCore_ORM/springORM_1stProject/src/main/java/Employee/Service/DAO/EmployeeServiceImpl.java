package Employee.Service.DAO;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Employee.Employee;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private HibernateTemplate hibernateTemplate;

//	01. Insert Record
	@Transactional
	public void addRecord(Employee emp) {
		hibernateTemplate.saveOrUpdate(emp);
	}

//	02. Update Record
	@Transactional
	public Employee updateRecord(Employee emp) {
		hibernateTemplate.update(emp);
		return emp;
	}

//	03. Delete Record
	@Transactional
	public int deleteRecord(int id) {
		Employee empID = hibernateTemplate.get(Employee.class, id);
		if (empID != null) {
			hibernateTemplate.delete(empID);
			System.out.println("Record Deleted Successfully");
		} else {
			System.err.println("Sorry...! \n\t ~Record Not Found...");
		}
		return id;
	}

//	04. Search By ID
	public int searchByID(int id) {
		Employee emp = hibernateTemplate.get(Employee.class, id);
		System.out.println(emp);
		return id;
	}

//	05. Search By Name
	public String searchByName(String name) {
		Employee emp = hibernateTemplate.get(Employee.class, name);
		System.out.println(emp);
		return name;
	}

//	06. Showing All Employee
	public List<Employee> showAllRecord() {
		List<Employee> loadAll = hibernateTemplate.loadAll(Employee.class);
		return loadAll;
	}

//	07. Delete All Record
	@Transactional
	public void deleteAll() {
		List<Employee> loadAll = hibernateTemplate.loadAll(Employee.class);
		hibernateTemplate.deleteAll(loadAll);
	}
}