package Mobile_Sim;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
	private String brand;
	private String mobileColor;
	private String model;
	private String screenSize;

	private Sim sim;

	public Mobile(Sim sim) {
		this.sim = sim;
	}

	public void showMobileDetails() {
		System.out.println("Mobile Brand: " + brand);
		System.out.println("mobile Color: " + mobileColor);
		System.out.println("Mobile Model: " + model);
		System.out.println("Screen Size: " + screenSize);

		if (sim != null) {
			sim.calling();
			sim.internet();
		} else {
			System.out.println("\nSim Not Inserted... \n\t~Please Insert Your Sim First.");
		}
	}
}
