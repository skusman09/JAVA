package reference_Using_Bean;

import org.springframework.context.annotation.Bean;

public class SpringConfig5 {

	@Bean(name = { "ml", "mll", "mal" })
	public Mall mall() {
		return new Mall(shop(), shopkeeper());
	}

	@Bean({ "shp", "sp" })
	public Shop shop() {
		return new Shop(shopkeeper());
	}

	@Bean({ "spkpr", "shpkpr", "spkr" }) // We Can Also Write Like This
	public Shopkeeper shopkeeper() {
		return new Shopkeeper();
	}
}
