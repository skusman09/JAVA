package company;

import lombok.Data;

@Data
public class Department {
	private String jobType;
	private String jobAddress;

	public void itJob() {
		System.out.println("\nEmployee Doing " + jobType + " Job");
	}

	public void address() {
		System.out.println("Employee Doing Job In " + jobAddress);
	}
}
