package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	@Id
	@Column(name = "Employee_ID")
	private int empId;

	@Column(name = "Employee_Name", length = 20)
	private String empName;

	@Column(name = "DateOfJoing")
	@Temporal(TemporalType.DATE)
	private Date empdoj;

	private long salary;

	@ManyToOne(cascade = CascadeType.ALL)
	private Company company;
}
