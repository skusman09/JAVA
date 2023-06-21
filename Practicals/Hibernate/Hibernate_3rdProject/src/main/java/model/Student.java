package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Students_Info")
public class Student {
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int std_Id;

	@Column(name = "Name", nullable = false, length = 20)
	private String std_name;

	@Column(length = 20)
	private String course;

	@Column(name = "Address", nullable = false, length = 50)
	private String add;

	@Column(name = "Age", nullable = false)
	private int age;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date doj;

}
