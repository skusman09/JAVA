package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Hostel;
import com.app.services.HostelService;

import lombok.Data;

@Data
@RestController
public class HostelController {

	@Autowired
	private HostelService hostelService;

//01. Adding New Hostels
	@PostMapping("/add")
	public String addHostel(@RequestBody Hostel hstl) {
		return hostelService.addHostel(hstl);
	}

//Get Hostels By Their ID
	@GetMapping("/get/{id}")
	public Hostel getHostelDetails(@PathVariable int id) {
		return hostelService.getHostelDetails(id);
	}

	@PutMapping("/update/{id}")
	public String updateHostelDetails(@PathVariable int id, @RequestBody Hostel hstl) {
		return hostelService.updateHostelDetails(id, hstl);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteHostel(@PathVariable int id) {
		return hostelService.deleteHostel(id);
	}

	@GetMapping("/showAll")
	public List<Hostel> showAll() {
		return hostelService.showAll();
	}

	@PostMapping("/saveAll")
	public String saveAll(@RequestBody List<Hostel> std) {
		return hostelService.saveAll(std);
	}

	@DeleteMapping("/clearAll")
	public String deleteAll() {
		return hostelService.clearAll();
	}
}
