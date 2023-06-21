package mobileSim;

import lombok.Data;

@Data
public class Mobile {
	private String mobBrand;
	private String mobModel;
	private String mobColor;
	private double screenSize;
	private long mobPrice;
	private Sim sim;
}
