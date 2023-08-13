package withoutXML_Using_Component_Ref_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component("wng")
public class Wing {
	@Value("12") // No Need To Set 'numOfWing' If We Use This
	private int numOfWing;

	@Autowired
	private Flats flat;

	public void showWing() {
//		flat.setNumOfFlat("3BHK OR 2BHK");  // // If We Use @Value Then No Need Setter And All
		System.out.println("In This Wing There Are " + flat.getNumOfFlat() + " Flats. ");
	}
}
