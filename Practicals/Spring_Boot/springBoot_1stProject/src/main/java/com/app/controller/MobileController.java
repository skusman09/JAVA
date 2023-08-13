package com.app.controller;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Mobile;

@RestController
public class MobileController {

	@GetMapping("/product/mobileList")
	public List<Mobile> mobileList(String name) {
		List<Mobile> mobileList = new LinkedList<>();
		Mobile mob1 = new Mobile("AWQW3443", "Apple", "iPhone 14 pro", "Hexa-core Apple A16 Bionic", "Rose Gold",
				120000);
		Mobile mob2 = new Mobile("POUL4652", "Xiaomi", "Mi 9 pro", "Qualcomm Snapdragon 8 Gen 1", "Silver", 30000);
		Mobile mob3 = new Mobile("SADR4785", "Samsung", "s22 Ultra", "Qualcomm Snapdragon 8 Gen 2", "Ocean Black",
				50000);

		Collections.addAll(mobileList, mob1, mob2, mob3);
		return mobileList;
	}
}