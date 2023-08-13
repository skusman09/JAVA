package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Hostel;
import com.app.repository.HostelRepository;

import lombok.Data;

@Data
@Service
public class HostelServiceImpl implements HostelService {

	@Autowired
	private HostelRepository hostelRepository;

//01. Add New Hostels
	@Override
	public String addHostel(Hostel hstl) {
		hostelRepository.save(hstl);
		return "New Hostel ID Added Successfully";
	}

//02. Get Hostel By Their ID
	@Override
	public Hostel getHostelDetails(int id) {
		Optional<Hostel> findById = hostelRepository.findById(id);
		return findById.get();
	}

//03. Update Hostel Details
	@Override
	public String updateHostelDetails(int id, Hostel hstl) {
		Optional<Hostel> findById = hostelRepository.findById(id);
		Hostel tempHostel = findById.get();
		tempHostel.setH_Name(hstl.getH_Name());
		tempHostel.setH_Rooms(hstl.getH_Rooms());
		tempHostel.setAddress(hstl.getAddress());
		tempHostel.setHostelDescription(hstl.getHostelDescription());
		tempHostel.setContact(hstl.getContact());
		hostelRepository.save(tempHostel);
		return "Hostel ID " + id + " Updated Successfully";
	}

//04. Delete Hostel By ID
	@Override
	public String deleteHostel(int id) {
		hostelRepository.deleteById(id);
		return "Hostel ID " + id + " Deleted Successfully";
	}

//05. Add Multiple New Hostels
	@Override
	public String saveAll(List<Hostel> hstl) {
		hostelRepository.saveAll(hstl);
		return hstl.size() + " Hostels Details Are Added Successfully";
	}

//06. Show All Hostels
	@Override
	public List<Hostel> showAll() {
		return hostelRepository.findAll();
	}

//07. Delete All Hostels
	@Override
	public String clearAll() {
		List<Hostel> findAll = hostelRepository.findAll();
		hostelRepository.deleteAll(findAll);
		return "All " + findAll.size() + " Records Are Deleted Successfully";
	}
}
