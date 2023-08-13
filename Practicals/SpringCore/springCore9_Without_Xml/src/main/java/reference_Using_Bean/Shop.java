package reference_Using_Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Shop {
	private Shopkeeper shopkeeper;

	public void showShop() {
		System.out.println("This Is Brand Shop");
	}
}
