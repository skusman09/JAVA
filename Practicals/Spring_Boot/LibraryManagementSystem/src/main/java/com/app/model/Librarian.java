package com.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "librarians")
public class Librarian {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column()
	private long id;
	private String name;
	private String address;
	private String emailId;
}
