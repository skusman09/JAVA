package withoutXML_Using_Bean_ReferenceClass;

import lombok.Data;

@Data
public class Country {
	private State state;
	private City city;

//	Using Setter
	public void setState(State state) {
		this.state = state;
	}

//	Using Setter
	public void setCity(City city) {
		this.city = city;
	}

//	Using Constructor
//	public Country(State state, City city) {
//		super();
//		this.state = state;
//		this.city = city;
//	}

	public void showCountry() {
		System.out.println("This is Country");
	}
}
