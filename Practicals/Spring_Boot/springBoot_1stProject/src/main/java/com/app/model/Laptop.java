package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Laptop {
	private String laptopID;
	private String laptopBrand;
	private String laptopModel;
	private String laptopProcessor;
	private String laptopColor;
	private long laptopPrice;
}