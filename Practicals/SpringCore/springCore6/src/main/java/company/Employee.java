package company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int empId;
	private String empName;
	private String empAddress;

	@Autowired
	@Qualifier("dept1")
	private Department dept;

	public void showEmployee() {
		System.out.println("Employee_ID: " + empId);
		System.out.println("Employee_Name: " + empName);
		System.out.println("Employee_Address: " + empAddress);

		if (dept != null) {
			dept.itJob();
			dept.address();
		} else {
			System.out.println("\nNo One Doing Job");
		}
	}
}
