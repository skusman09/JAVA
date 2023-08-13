package studentService.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std = new Student();
		std.setId(rs.getInt(1));
		std.setName(rs.getString(2));
		std.setCourse(rs.getString(3));
		return std;
	}
}
