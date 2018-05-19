package com.snowbirdit.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private int id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="studentId")
    private int studentId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="student_health_id", referencedColumnName="id")
	private StudentHealth student_health;

	
	
	
	@OneToMany(targetEntity=Device.class, mappedBy="student",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	List<Device> devices =new ArrayList<>();
	
	
    public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	

	public Student() {
		super();
	}

	public Student(int id, String name, int studentId) {
        this.id = id;
        this.name = name;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

	public StudentHealth getStudent_health() {
		return student_health;
	}

	public void setStudent_health(StudentHealth student_health) {
		this.student_health = student_health;
	}
    
    
    
    
    
}
