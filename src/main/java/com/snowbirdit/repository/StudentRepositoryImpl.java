package com.snowbirdit.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.snowbirdit.entity.Student;

public class StudentRepositoryImpl implements StudentRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager ;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getNameLike(String partOfName) {
		
		
		 Query query = entityManager.createNativeQuery("SELECT * FROM student " +
	                "WHERE name LIKE ?", Student.class);
	        query.setParameter(1, "%"+partOfName + "%");
	        return query.getResultList();
		
		
	}

	
	
}
