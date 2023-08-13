package reference_Using_Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Mall {
	private Shop shop;
	private Shopkeeper shopkeeper;

	public void showMall() {
		System.out.println("This Is World Biggest Mall");
	}
}
