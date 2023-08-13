package com.app.controller;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Laptop;

@RestController
public class LaptopController {

	@GetMapping("/product/laptopList")
	public List<Laptop> laptopList() {
		List<Laptop> laptopList = new LinkedList<>();
		Laptop mob1 = new Laptop("AHDN132", "DELL", "Inspiron XPS 15", "12th-generation i3", "silver", 40000);
		Laptop mob2 = new Laptop("QAS2234", "HP", "HP Pavilion", "Intel Core i9-13900K", "Black", 100000);
		Laptop mob4 = new Laptop("HAB45KA", "Apple", "Apple MacBook Pro", "M2 pro 19-core GPU", "Gray", 199900);

		Collections.addAll(laptopList, mob1, mob2, mob4);
		return laptopList;
	}
}