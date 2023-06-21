package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Student {
	@Id
	@Column(name = "Roll_Number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll_Num;

	@Column(name = "Student_Name", length = 20)
	private String std_Name;

	// Put mappedBy At Any One Of Class Either "Student" OR "Course"
	@ManyToMany(mappedBy = "students")
	private List<Course> courses;
}
