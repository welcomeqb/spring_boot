package com.snowbirdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snowbirdit.entity.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>, StudentRepositoryCustom{

}
