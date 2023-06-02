package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	String addStudent (Student s);//creating
	Student getstudent (String kodId);//Reading
	List<Student> getAllStudent();//Listing
	String updateStudent(Student s);//Updating
	String deleteStudent(String kodId);//Delete


}
