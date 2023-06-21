package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Company {
	@Id
	@Column(name = "Register_Number", length = 10)
	private String regNum;

	@Column(name = "Company_Name", length = 20)
	private String comName;

	@Column(name = "Company_Type", length = 20)
	private String comType;
}
