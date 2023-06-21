package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Course {
	@Id
	@Column(name = "Course_ID")
	private long c_Id;

	@Column(name = "Course_Name", length = 20)
	private String c_Name;

	// Put mappedBy At Any One Of Class Either "Student" OR "Course"
	// @ManyToMany(mappedBy = "courses") // We Use In Student Class
	@ManyToMany
	private List<Student> students;
}
