//	@author: Mohammed Usman Shaikh

package com.app.service;

import java.util.List;

import com.app.model.Patient;

public interface PatientServices {

//	01. Add New Patient
	public String addPatient(Patient ptnt);

//	02. Get Patients By Their ID
	public Patient getById(int id);

//	03. Update Patients Details
	public String updatePatient(int id, Patient ptnt);

//	04. Delete Patients By ID
	public String deletePatient(int id);

//	05. Add Multiple New Patient
	public String saveAll(List<Patient> ptnt);

//	06. Show All Patients
	public List<Patient> showAll();

//	07. Delete All Patients
	public String clearAll();
}