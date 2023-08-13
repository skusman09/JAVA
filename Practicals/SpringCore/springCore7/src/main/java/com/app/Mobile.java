package com.app;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Mobile {
//	@Value("Xiaomi")
	@Value("${mobile.mobileBrand}")
	private String mobileBrand;

//	@Value("Gold")
	@Value("${mobile.mobileColor}")
	private String mobileColor;

//	@Value("Xiaomi 13")
	@Value("${mobile.model}")
	private String model;

//	@Value("6.7")
	@Value("${mobile.screenSize}")
	private float screenSize;

	public void showMobile() {
		System.out.println("Mobile barnd: " + mobileBrand);
		System.out.println("Mobile Color: " + mobileColor);
		System.out.println("Mobile Model: " + model);
		System.out.println("Screen Size: " + screenSize);
	}
}
