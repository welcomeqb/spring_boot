package com.snowbirdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snowbirdit.entity.Student;


public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
