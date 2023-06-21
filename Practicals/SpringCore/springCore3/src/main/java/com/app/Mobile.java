package com.app;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Mobile {
	private String mobileBrand;
	private String mobileColor;
	private long mobilePrice;
	private String screenSize;

	public Mobile(String mobileBrand, String mobileColor, long mobilePrice, String screenSize) {
		super();
		this.mobileBrand = mobileBrand;
		this.mobileColor = mobileColor;
		this.mobilePrice = mobilePrice;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Mobile [mobileBrand=" + mobileBrand + ", mobileColor=" + mobileColor + ", mobilePrice=" + mobilePrice
				+ ", screenSize=" + screenSize + "]";
	}

}
