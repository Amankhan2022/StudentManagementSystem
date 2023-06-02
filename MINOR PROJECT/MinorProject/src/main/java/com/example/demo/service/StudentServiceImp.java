package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	      StudentRepository srepo;


		@Override
		public String addStudent(Student s) {
			srepo.save(s);
			return "Student added sucessfully!";
		}

		@Override
		public Student getstudent(String kodId) {
			Student st = srepo.findById(kodId).get();
			return st;
		}

		@Override
		public List<Student> getAllStudent() {
			List<Student> slist=srepo.findAll();
			return slist;
		}

		@Override
		public String updateStudent(Student s) {
			srepo.save(s); 
			return "Student update sucessfully!";
		}

		@Override
		public String deleteStudent(String kodId) {
			srepo.deleteById(kodId); 
			return "student delete successfully";
		}
	}




