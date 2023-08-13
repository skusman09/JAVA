package studentService.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentService_Impl implements StudentService_Intrfce {

	private JdbcTemplate jdbcTemplate;

//	01. Creating Table
	public void createTable() {
		String query = "CREATE TABLE IF NOT EXISTS Test (Std_Id int primary key, Std_Name varchar(20) not null, Course varchar(20) not null)";
		jdbcTemplate.execute(query);
	}

//	02. Insert One Record Into Table
	public void insertByOne(Student std) {
		String query = "Insert INTO test VALUES(?,?,?)";

//		1st Approach
//		int id = std.getId();
//		String name = std.getName();
//		String course = std.getCourse();
//		Object[] listObj = { id, name, course };

//		2nd Approach
		int res = jdbcTemplate.update(query, std.getId(), std.getName(), std.getCourse());

		if (res >= 1) {
			System.out.println(res + " Record Added Successfully");
		} else {
			System.out.println("Not Inserted");
		}
	}

//	2A. Adding Bulk Record Into Table
	public void insert(List<Student> stList) {
		String query = "Insert INTO test VALUES(?,?,?)";

		List<Object[]> studentList = new ArrayList<Object[]>();

		for (Student ls : stList) {
			Object[] oneStd = { ls.getId(), ls.getName(), ls.getCourse() };
			studentList.add(oneStd);
		}

		int[] batchUpdate = jdbcTemplate.batchUpdate(query, studentList);
		if (batchUpdate.length >= 1) {
			System.out.println(batchUpdate.length + " Record Added At A Time");
		} else {
			System.out.println("Not Added");
		}
	}

//	03. Update Record
	public int updateRecord(Student std) {
		String query = "UPDATE Test Set Std_Name=?, Course=? Where Std_Id=?";
		int update = jdbcTemplate.update(query, std.getName(), std.getCourse(), std.getId());
		return update;
	}

//	04. Delete Record By ID
	public boolean deleteById(int id) {
		String query = "DELETE FROM Test Where Std_Id = ?";
		int updateList = jdbcTemplate.update(query, id);
		if (updateList >= 1) {
			System.out.println("ID " + id + " Deleted Successfuly");
		} else {
			System.err.println("ID " + id + " Not Found");
		}
		return true;
	}

//	05.  Search By ID
	public boolean searchByID(int id) {
		try {
			String query = "Select * From Test Where Std_Id=?";
			if (id != 0) {
				Student queryForObject = jdbcTemplate.queryForObject(query, new RowMapperImpl(), id);
				System.out.println(queryForObject);
			}
		} catch (DataAccessException e) {
			System.err.println(id + " ID Not Found");
		}
		return true;
	}

//	06. Search By Name
	// @In This Approach Only One "Student" Will Be Showing
	public Student searchName(String name) {
		String query = "Select * From Test Where Std_Name=?";
		Student queryForObject = jdbcTemplate.queryForObject(query, new RowMapperImpl(), name);
		return queryForObject;
	}

//	06-A. Search By Name 
//	 @In This Approach Many "Student" Will Be Showing
	public void searchByName(String name) {
		String query = "Select * From Test Where Std_Name=?";
		List<Student> query2 = jdbcTemplate.query(query, new RowMapperImpl(), name);
		if (name != null) {
			for (Student stdObj : query2) {
				System.out.println(stdObj);
			}
		} else {
			System.err.println("Sorry...! \n\t" + name + " Not Found");
		}
	}

//	07. Showing All Students Record
	public List<Student> showAll() {
		String query = "SELECT * FROM Test";
		List<Student> stdList = jdbcTemplate.query(query, new RowMapperImpl());
		System.out.println();
		for (Student s : stdList) {
			System.out.println(s);
		}
		return stdList;
	}

//	08. Deleting All Record From Table 'Test'
	public void clearAll() {
		String query = "TRUNCATE TABLE Test";
		jdbcTemplate.execute(query);
	}
}
