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

import com.app.model.Student;
import com.app.services.StudentService;

import lombok.Data;

@Data
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public String save(@RequestBody Student std) {
		studentService.saveStudent(std);
		return "Student Saved Successfully";
	}

	@PutMapping("/update/{id}")
	public String update(@PathVariable int id, @RequestBody Student std) {
		studentService.updateStudent(std, id);
		return "Student ID " + id + " Update Successfully";
	}

	@GetMapping("/getByID/{id}")
	public Student getID(@PathVariable(name = "id") int id) {
		return studentService.getStudentByID(id);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}

	@GetMapping("/showAll")
	public List<Student> showAll() {
		return studentService.showAll();
	}

	@PostMapping("/saveAll")
	public String saveAll(@RequestBody List<Student> std) {
		return studentService.saveAll(std);
	}

	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		return studentService.deleteAll();
	}

}