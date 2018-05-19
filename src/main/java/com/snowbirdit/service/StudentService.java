package com.snowbirdit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snowbirdit.entity.Device;
import com.snowbirdit.entity.Student;
import com.snowbirdit.repository.StudentRepository;

@Service
public class StudentService {


    
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){

        return studentRepository.findAll();
    }
    
    public List<Student> searchStudentByName(String partOfName){

        return studentRepository.getNameLike(partOfName);
    }

	public Optional<Student> getStudent(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}
	
	public Student updateStudent(Student stud) {
		
		return studentRepository.save(stud);
	}
	
	public Student addNewStudent(Student stud) {
		
		//stud.getDevices().add(new Device("winwin","pcc6"));
		return studentRepository.saveAndFlush(stud);
	}
	
	public void deleteStudent(int id) {
		
		studentRepository.deleteById(id);
	}

	
}
