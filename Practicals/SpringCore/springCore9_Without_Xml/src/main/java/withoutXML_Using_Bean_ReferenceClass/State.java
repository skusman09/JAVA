package withoutXML_Using_Bean_ReferenceClass;

import lombok.Data;

@Data
public class State {
	private City city;

//	Setter
	public void setCity(City city) {
		this.city = city;
	}

//	Constructor
//	public State(City city) {
//		this.city = city;
//	}

	public void showState() {
		System.out.println("This Is State");
	}
}
