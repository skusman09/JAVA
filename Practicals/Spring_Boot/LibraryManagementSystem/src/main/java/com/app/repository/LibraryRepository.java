package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Librarian;

public interface LibraryRepository extends JpaRepository<Librarian, Integer> {

}
