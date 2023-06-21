package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@Column(name = "RollNumber")
	private int roll;

	@Column(name = "Student_Name", length = 30)
	private String std_name;

	@Column(name = "Address", length = 20)
	private String add;

	@Column(name = "phoneNumber", length = 10)
	private String phone;

	@OneToOne(cascade = CascadeType.ALL)
	private Courses courses;

}
