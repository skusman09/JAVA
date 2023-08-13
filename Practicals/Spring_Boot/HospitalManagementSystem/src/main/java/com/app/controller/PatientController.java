//	   @author: Mohammed Usman Shaikh

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

import com.app.model.Patient;
import com.app.service.PatientServices;

import lombok.Data;

@Data
@RestController
public class PatientController {

	@Autowired
	private PatientServices patientServices;

//	01. Adding New Patients
	@PostMapping("/add")
	public String addPatient(@RequestBody Patient ptnt) {
		return patientServices.addPatient(ptnt);
	}

//	Get Patients By Their ID
	@GetMapping("/get/{id}")
	public Patient getById(@PathVariable int id) {
		return patientServices.getById(id);
	}

	@PutMapping("/update/{id}")
	public String updatePatient(@PathVariable int id, @RequestBody Patient ptnt) {
		return patientServices.updatePatient(id, ptnt);
	}

	@DeleteMapping("/delete/{id}")
	public String deletePatient(@PathVariable int id) {
		return patientServices.deletePatient(id);
	}

	@GetMapping("/showAll")
	public List<Patient> showAll() {
		return patientServices.showAll();
	}

	@PostMapping("/saveAll")
	public String saveAll(@RequestBody List<Patient> std) {
		return patientServices.saveAll(std);
	}

	@DeleteMapping("/clearAll")
	public String deleteAll() {
		return patientServices.clearAll();
	}
}
