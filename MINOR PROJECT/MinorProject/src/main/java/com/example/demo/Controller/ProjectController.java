package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class ProjectController {
@Autowired
	StudentService ss;
	
	@GetMapping("/register")
	public String mapRegister() {
		return "register";
	}

	@GetMapping("/remove")
	public String mapremove() {
		return "remove";
	}

	@GetMapping("/update")
	public String mapUpdateInfo() {
		return "UpdateInfo";
	}

	@GetMapping("/view")
	public String mapViewInfo() {
		return "ViewInfo";
	}

	@GetMapping("/showInfo")
	public String showInfo() {
		return "showInfo";
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}
/*
	@GetMapping("/getAllStud")
	public List<Student> getAllStudents(Model model) {

		List<Student> stList = ss.getAllStudent();

		model.addAttribute("list", stList);
		System.out.println(stList);
		return stList;
	}

	@PostMapping("/addStud")
	public String addStudent(@RequestParam("name") String name, @RequestParam("kodId") String kodId,
			@RequestParam("branch") String branch) {

		Student s = new Student(kodId, name, branch);
		System.out.println(s);
		ss.addStudent(s);
		return "index";

	}

	@PutMapping("/updStud")
	public String updateStudent(@RequestParam("kodId") String kodId, @RequestParam("name") String name,
			@RequestParam("branch") String branch) {

		Student st = ss.getstudent(kodId);
		st.setKodId(kodId);
		st.setName(name);
		st.setBranch(branch);
		ss.updateStudent(st);
		return "redirect:/";
	}

	@GetMapping("/getStud")
	public String getStudent(@RequestParam("kodId") String kodId, Model model) {
		Student st = ss.getstudent(kodId);
		model.addAttribute("student", st);
		System.out.println(st);
		return "showInfo";
	}

	@DeleteMapping("/delstud")
	public String deleteStudent(@RequestParam("kodId") String kodId) {
		ss.deleteStudent(kodId);
		return "redirect:/";
	}
	*/
}