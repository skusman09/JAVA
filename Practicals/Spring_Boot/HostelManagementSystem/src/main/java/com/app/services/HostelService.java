package com.app.services;

import java.util.List;

import com.app.model.Hostel;

public interface HostelService {

//01. Add New Hostel
	public String addHostel(Hostel hstl);

//02. Get Hostel Details By Their ID
	public Hostel getHostelDetails(int id);

//03. Update Hostel Details
	public String updateHostelDetails(int id, Hostel hstl);

//04. Delete Hostel By ID
	public String deleteHostel(int id);

//05. Add Multiple New Hostel
	public String saveAll(List<Hostel> hstl);

//06. Show All Hostels
	public List<Hostel> showAll();

//07. Delete All Hostels
	public String clearAll();
}