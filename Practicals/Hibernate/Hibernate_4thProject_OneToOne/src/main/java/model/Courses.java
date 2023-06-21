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
public class Courses {
	@Id
	@Column(name = "course_Id", length = 10)
	private String c_Id;

	@Column(name = "course_Name", length = 20)
	private String c_Name;

	@Column(length = 20)
	private String duration;
	
	@Column(name = "course_fee")
	private long c_fee;

}
