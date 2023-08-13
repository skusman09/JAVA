package com.app.services;

import java.util.List;
import com.app.model.Librarian;

public interface LibraryService {

	String saveLibrary(Librarian librarian);

	List<Librarian> getAllLibrarians();

	Librarian getLibrarianById(int id);

	String deleteLibrarian(int id);
}