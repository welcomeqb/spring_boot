package com.snowbirdit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="device")
public class Device {

	@Id
	@GeneratedValue
	@Column(name="id")
	Integer id;
	
	@Column
	String name;
	
	@Column
	String os;
	
	
	
	
	@ManyToOne
	@JoinColumn(name="studentid")
	Student student;
	
	
	
	//Note: we cannot have getParent in a children class since it will cause inddefinte loop
	/*
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	*/
	
	//another way is return null for child class getStudnet
	//third way is return student id
	public Integer getStudent() {
		return student.getId();
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	public Device(Integer id, String name, String os, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.os = os;
		
	}
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Device( String name, String os) {
		super();
		
		this.name = name;
		this.os = os;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	
	
}
