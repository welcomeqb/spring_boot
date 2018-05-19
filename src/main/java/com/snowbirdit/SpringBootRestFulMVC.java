package com.snowbirdit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.snowbirdit.entity.Student;

@SpringBootApplication
public  class SpringBootRestFulMVC {

	
	public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestFulMVC.class,args);
        System.out.println("Hello ya");
        
       HashMap<Integer,Student> ll = new HashMap<>();
        Student aStudent = new Student(1, "111", 12312);
        Student aStudent2 = new Student(1, "2222", 12312);
        ll.put(1, aStudent);
        ll.put(2, aStudent2);
        
        System.out.println(ll.get(1).getName() + "   "+ ll.get(2).getName());
        
        
        
        
        
        System.out.println("flag0");
        ArrayList<String>  ss = new ArrayList<>();
        ss.add("eee");
        ss.add("bbb");
        ss.add("ccc");
        ss.add("ddd");
        ss.add("aaa");
        
        for (String x : ss) {
			System.out.println(x.toString());
		}
        
        System.out.println("flag1");
        ss.stream()
        .sorted()
        .forEach(System.out::println);
        
        System.out.println("flag2");
        
        for (String x : ss) {
			System.out.println("current:"+x.toString());
		}
        
        List<String> bb = ss.stream()
        		.sorted()
        		.collect(Collectors.toList());
        
        for (String x : bb) {
			System.out.println("flag 4:"+x.toString());
		}
        
        System.out.println("flag5");
        
        ss.forEach(x->System.out.println(x));
        
        
        
    }

}
