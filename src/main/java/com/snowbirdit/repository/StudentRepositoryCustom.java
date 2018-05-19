package com.snowbirdit.repository;

import java.util.List;

import com.snowbirdit.entity.Student;

public interface StudentRepositoryCustom {

	List<Student> getNameLike(String partOfName);
}
