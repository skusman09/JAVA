package emp;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private int empId;
	private String empName;
	private long salary;

	private List<String> empMobNum;
	private Set<String> empAddress;
	private Map<String, String> deptDetails;
}
