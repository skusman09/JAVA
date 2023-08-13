package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
	private String mobileID;
	private String mobileBrand;
	private String mobileModel;
	private String mobileProcessor;
	private String mobileColor;
	private long mobilePrice;

}
