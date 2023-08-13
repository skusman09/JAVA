package studentService.DAO;

import java.util.List;

import model.Student;

public interface StudentService_Intrfce {

//	01. Creating Tables
	void createTable();

//	02. Add Only One Student At A Time
	void insertByOne(Student std);

//	2A. Add Many(Bulk) Student At A Time
	void insert(List<Student> student);

//	03. Update Record
	int updateRecord(Student std);

//	04. Delete By ID
	boolean deleteById(int id);

//	05. Search By ID
	boolean searchByID(int id);

//	06. Search By Name
	Student searchName(String name);

//	06-A. Search By Name
	void searchByName(String name);

//	07. Show All Records
	List<Student> showAll();

//	08. Deleting All Record
	void clearAll();
}
