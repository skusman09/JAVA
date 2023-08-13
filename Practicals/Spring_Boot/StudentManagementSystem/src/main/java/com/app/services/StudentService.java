package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Student;

@Service
public interface StudentService {

//	01. Save Only One Student Record
	public Student saveStudent(Student std);

//	02. Get Student by Id
	public Student getStudentByID(int id);

//	03. Get Student By Name
	public Student getStudentByName(String name);

//	04. Delete Student
	public String deleteStudent(int id);

//  05. Update Student
	public Student updateStudent(Student updateStd, int id);

//	06. Show All
	public List<Student> showAll();

//	07. Save More Than One Student At a Time
	public String saveAll(List<Student> std);

//	08. Delete All Student
	String deleteAll();

}