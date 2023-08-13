//   @author: Mohammed Usman Shaikh

package com.app.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patientID")
	@Id
	private int p_ID;

	@Column(name = "patientName", length = 50, nullable = false)
	private String p_name;

	@Column(length = 10, nullable = false)
	private int age;

	@Column(length = 10, nullable = false)
	private String gender;

	@Column(length = 12, nullable = false)
	private String contact;

	@Column(length = 100, nullable = false)
	private String address;

	@Column(length = 100, nullable = false)
	private String medicalHistory;

	@Column(length = 20, nullable = false)
	private Date appointments;
}