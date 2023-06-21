package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // This Is For toString, GetterSetter And Many More..
@AllArgsConstructor // This is For Parameterized Constructor
@NoArgsConstructor  // This Is For Default Constructor
@Entity // This Is Mandatory For Creating Table In DB
@Table(name = "Student_Details") // We Can Change DB Table Name
public class Student {
	@Id // This IS Also Mandatory
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Generate The Value
	private int st_id;

	@Column(length = 50, nullable = false)
	private String sname;

	@Column(length = 10, nullable = false, unique = true)
	private String contact;

}
