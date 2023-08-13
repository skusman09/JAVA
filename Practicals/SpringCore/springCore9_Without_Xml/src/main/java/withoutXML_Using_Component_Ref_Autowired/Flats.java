package withoutXML_Using_Component_Ref_Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component("flts")
public class Flats {

	@Value("2BHK OR 3BHK") // No Need To Set 'numOfFlat'
	private String numOfFlat;

	public void showFlats() {
//		setNumOfFlat("2BHK OR 3BHK"); // If We Use @Value Then No Need Setter And All
		System.out.println("This Is " + getNumOfFlat() + " Flat.");
	}
}
