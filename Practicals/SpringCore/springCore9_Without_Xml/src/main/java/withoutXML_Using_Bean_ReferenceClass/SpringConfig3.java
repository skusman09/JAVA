package withoutXML_Using_Bean_ReferenceClass;

import org.springframework.context.annotation.Bean;

//@Configuration
public class SpringConfig3 {

	@Bean(name = { "cntry", "ctry", "cnt", "count" })
	public Country country() {
//		return new Country(state(), city()); // Using Constructor
		
		Country cont = new Country(); // Using Setter
		cont.setState(state());
		cont.setCity(city());
		return cont;
	}

	@Bean({ "stat", "st" }) // We Can Also Write Without Name
	public State state() {
//		return new State(city()); // Using Constructor
		
		State st = new State(); // Using Setter
		st.setCity(city());
		return st;
	}

	@Bean(name = { "cty" })
	public City city() {
		return new City();
	}
}
