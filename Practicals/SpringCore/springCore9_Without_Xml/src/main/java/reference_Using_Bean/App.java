package reference_Using_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import lombok.Data;

@Data
public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new AnnotationConfigApplicationContext(SpringConfig5.class);

		Mall mall = apc.getBean("ml", Mall.class);
		mall.showMall();

		Shop shop = apc.getBean("shp", Shop.class);
		shop.showShop();

		Shopkeeper shopkeeper = apc.getBean("shpkpr", Shopkeeper.class);
		shopkeeper.showShopkeeper();

		((AbstractApplicationContext) apc).close();
	}
}
