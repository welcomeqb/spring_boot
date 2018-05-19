package com.snowbirdit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_health")
public class StudentHealth {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	@Column
	String comments;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getComments() {
		return comments;
	}



	public void setComments(String comments) {
		this.comments = comments;
	}



	public StudentHealth() {
		// TODO Auto-generated constructor stub
	}

}
