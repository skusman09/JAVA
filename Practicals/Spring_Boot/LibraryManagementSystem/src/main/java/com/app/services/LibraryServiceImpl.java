package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Librarian;
import com.app.repository.LibraryRepository;

import lombok.Data;

@Data
@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private LibraryRepository libraryRepository;

	@Override
	public String saveLibrary(Librarian librarian) {
		libraryRepository.save(librarian);
		return "Librarian ID " + librarian.getId() + " Record Added Successfully";
	}

	@Override
	public List<Librarian> getAllLibrarians() {
		return libraryRepository.findAll();
	}

	@Override
	public Librarian getLibrarianById(int id) {
		Optional<Librarian> librarian = libraryRepository.findById(id);
		if (librarian.isPresent()) {
			return librarian.get();
		} else {
			return null;
		}
	}

	@Override
	public String deleteLibrarian(int id) {
		libraryRepository.deleteById(id);
		return "ID " + id + " Deleted Successfully";
	}
}
