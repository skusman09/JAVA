package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class College {
	@Id
	@Column(name = "Register_Number", length = 10)
	private String regNumber;

	@Column(name = "Colege_Name", length = 20)
	private String Coll_name;

	@Column(name = "College_Address", length = 30)
	private String Address;

}
