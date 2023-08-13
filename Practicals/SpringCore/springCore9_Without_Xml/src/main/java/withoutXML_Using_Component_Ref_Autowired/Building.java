package withoutXML_Using_Component_Ref_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component("bldg")
public class Building {

	@Autowired
	private Wing wing;

	@Autowired
	private Flats flat;

	public void showBuilding() {
//		wing.setNumOfWing(12); // If We Use @Value Then No Need Setter And All

		if (wing != null & flat != null) {
//			flat.setNumOfFlat("2BHK OR 3BHK");  // If We Use @Value Then No Need Setter And All
			System.out.println("In This Building There Are " + wing.getNumOfWing() + " Wing And " + flat.getNumOfFlat()
					+ " Flats.");
		} else {
			System.out.println("In This Building There Are " + wing.getNumOfWing() + " Wing But No Flats Available");
		}

	}
}
