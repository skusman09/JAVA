package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Hostel;

public interface HostelRepository extends JpaRepository<Hostel, Integer> {

}
