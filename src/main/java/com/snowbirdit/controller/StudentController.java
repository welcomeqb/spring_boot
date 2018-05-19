package com.snowbirdit.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.snowbirdit.entity.Device;
import com.snowbirdit.entity.Student;
import com.snowbirdit.entity.StudentHealth;
import com.snowbirdit.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
 
    @RequestMapping(method=RequestMethod.GET)
    public List<Student> getAllStudents(){
    	
        return studentService.getAllStudents();
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public Optional<Student> getStudent(@PathVariable("id") Integer id) {
    	return studentService.getStudent(id);
    }
    
    @RequestMapping(value="/searchName/{partOfName}", method=RequestMethod.GET)
    public List<Student> getStudentsByName(@PathVariable String partOfName){
    	return studentService.searchStudentByName(partOfName);
    	
    }
    
    /*to test this using postman,  using put -->Body -->RAW--> JSON(application json)*/
    @RequestMapping(method=RequestMethod.PUT)  //,consumes = MediaType.APPLICATION_JSON_VALUE)
    public  Student updateStudent(@RequestBody() Student stud) {
    	
    	//Optional<Student> studFromDb = studentService.getStudent((Integer)stud.getId());
    	
    	//return null;
    	return studentService.updateStudent(stud);
    }
    
    /*to test this using postman,  using post -->Body -->RAW--> JSON(application json)*/
    @RequestMapping(method=RequestMethod.POST)
    public Student newStudent(@Valid @RequestBody Student stud) {
    	
    	System.out.println(stud);
    	
    	Device aDevice = new Device("new222", "new 333");
    	stud.getDevices().add(aDevice);
    	aDevice.setStudent(stud);
    	
    	StudentHealth health = new StudentHealth();
    	health.setComments("sick");
    	
    	stud.setStudent_health(health);
    	return studentService.addNewStudent(stud);
    }
    
    @RequestMapping(path="/{id}", method=RequestMethod.DELETE)
    public void deleteStudent(@PathVariable int id) {
    	
    	studentService.deleteStudent(id);
    }
    

}
