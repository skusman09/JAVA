// 	@author: Mohammed Usman Shaikh

package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Patient;
import com.app.repository.PatientRepository;

import lombok.Data;

@Data
@Service
public class PatientServicesImpl implements PatientServices {

	@Autowired
	private PatientRepository patientRepository;

//	01. Add New Patients
	@Override
	public String addPatient(Patient ptnt) {
		patientRepository.save(ptnt);
		return "New Patient ID " + ptnt.getP_ID() + " Added Successfully";
	}

//	02. Get Patients By Their ID
	@Override
	public Patient getById(int id) {
		Optional<Patient> findById = patientRepository.findById(id);
		return findById.get();
	}

//	03. Update Patients Details
	@Override
	public String updatePatient(int id, Patient ptnt) {
		Optional<Patient> findById = patientRepository.findById(id);
		Patient tempPatient = findById.get();
		tempPatient.setP_name(ptnt.getP_name());
		tempPatient.setAge(ptnt.getAge());
		tempPatient.setGender(ptnt.getGender());
		tempPatient.setContact(ptnt.getContact());
		tempPatient.setAddress(ptnt.getAddress());
		tempPatient.setMedicalHistory(ptnt.getMedicalHistory());
		tempPatient.setAppointments(ptnt.getAppointments());
		patientRepository.save(tempPatient);
		return "Patient ID " + id + " Updated Successfully";
	}

//	04. Delete Patients By ID
	@Override
	public String deletePatient(int id) {
		patientRepository.deleteById(id);
		return "Patient ID " + id + " Deleted Successfully";
	}

//	05. Add Multiple New Patient
	@Override
	public String saveAll(List<Patient> ptnt) {
		patientRepository.saveAll(ptnt);
		return ptnt.size() + " Patients Records Are Added Successfully";
	}

//	06. Show All Patients
	@Override
	public List<Patient> showAll() {
		return patientRepository.findAll();
	}

//	07. Delete All Patients
	@Override
	public String clearAll() {
		List<Patient> findAll = patientRepository.findAll();
		patientRepository.deleteAll(findAll);
		return "All " + findAll.size() + " Records Are Deleted Successfully";
	}
}
