package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Librarian;
import com.app.services.LibraryService;

import lombok.Data;

@Data
@RestController
public class LibraryController {

	@Autowired
	private LibraryService libraryService;

	// build create librarian REST API
	@PostMapping("/add")
	public String saveLibrary(@RequestBody Librarian librarian) {
		return libraryService.saveLibrary(librarian);
	}

	// build get all librarians REST API
	@GetMapping("/getAll")
	public List<Librarian> getAllEmployees() {
		return libraryService.getAllLibrarians();
	}

	// build get librarians by id rest api
	// http://localhost:8080/api/librarians/1
	@GetMapping("/get/{id}")
	public Librarian getLibrarianById(@PathVariable int id) {
		return libraryService.getLibrarianById(id);
	}

	// build delete librarian rest api
	@DeleteMapping("/delete/{id}")
	public String deleteLibrarian(@PathVariable int id) {
		return libraryService.deleteLibrarian(id);
	}

}
