package com.app.model;

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
public class Hostel {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Hostel_ID")
	@Id
	private int h_Id;

	@Column(name = "Hostel_Name", length = 50, nullable = false)
	private String h_Name;

	@Column(name = "Hostel_Room", length = 100, nullable = false)
	private String h_Rooms;

	@Column(length = 100, nullable = false)
	private String address;

	@Column(length = 20, nullable = false)
	private String hostelDescription;

	@Column(length = 12, nullable = false)
	private String contact;
}