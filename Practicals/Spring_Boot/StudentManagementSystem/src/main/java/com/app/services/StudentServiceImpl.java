package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.StudentRepository.StudentRepository;
import com.app.model.Student;

import lombok.Data;

@Data
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

//	01.
	@Override
	public Student saveStudent(Student std) {
		return studentRepository.save(std);
	}

//	02.
	@Override
	public Student getStudentByID(int id) {
		Optional<Student> findById = studentRepository.findById(id);
		return findById.get();
	}

//	03.
	@Override
	public Student getStudentByName(String name) {
//		studentRepository.
		return null;
	}

//	04.
	@Override
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return " Student ID, " + id + " Is Deleted Successfully";
	}

//	05.
	@Override
	public Student updateStudent(Student updateStd, int id) {
		Optional<Student> findId = studentRepository.findById(id);
		Student stdTemp = null;
		if (findId.isPresent()) {
			stdTemp = findId.get();
			stdTemp.setStdName(updateStd.getStdName());
			stdTemp.setCourse(updateStd.getCourse());
			stdTemp.setEmail(updateStd.getEmail());
			stdTemp.setAddress(updateStd.getAddress());
			stdTemp.setContact(updateStd.getContact());
			studentRepository.save(stdTemp);
		}
		return stdTemp;
	}

//	06.
	@Override
	public List<Student> showAll() {
		return studentRepository.findAll();
	}

//	07.
	@Override
	public String saveAll(List<Student> std) {
		studentRepository.saveAll(std);
		return std.size() + " New Student Records Are Saved Successfully";
	}

//	08.
	@Override
	public String deleteAll() {
		List<Student> findAll = studentRepository.findAll();
		studentRepository.deleteAll(findAll);
		return findAll.size() + " Record Deleted Successfully";
	}
}