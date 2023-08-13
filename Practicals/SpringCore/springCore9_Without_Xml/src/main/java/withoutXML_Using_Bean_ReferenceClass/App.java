package withoutXML_Using_Bean_ReferenceClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new AnnotationConfigApplicationContext(SpringConfig3.class);
		Country country = apc.getBean("cntry", Country.class);
		country.showCountry();

		State state = apc.getBean("stat", State.class);
		state.showState();

		City city = apc.getBean("cty", City.class);
		city.showCity();

		((AnnotationConfigApplicationContext) apc).close();
	}
}
