package Mobile_Sim;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sim {
	private String simName;

	public void calling() {
		System.out.println("\nCalling With " + simName);
	}

	public void internet() {
		System.out.println("Using " + simName + " Internet");
	}
}
