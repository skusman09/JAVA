package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // For Getter/Setter, ToString, HashCode etc
@AllArgsConstructor // For Parameterized Constructor
@NoArgsConstructor // For Default Constructor
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll_Num;

	@Column(nullable = true)
	private String name;

	@Column(nullable = true)
	private String address;

	@Column(unique = true)
	private String number;
}
