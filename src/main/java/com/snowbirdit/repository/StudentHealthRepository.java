package com.snowbirdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snowbirdit.entity.StudentHealth;

@Repository
public interface StudentHealthRepository extends JpaRepository<StudentHealth, Integer>{

	

}
