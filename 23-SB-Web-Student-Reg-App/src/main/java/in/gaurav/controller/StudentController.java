package in.gaurav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.gaurav.binding.Student;
import in.gaurav.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/loadForm")
	public String loadRegForm(Model model) {
		
		model.addAttribute("genders", service.getGenders());
		model.addAttribute("courses", service.getCourse());
		model.addAttribute("timings", service.getTimings());
		
		Student sobj=new Student();
		model.addAttribute("student", sobj);
		
		return "index";
	}
	
	@PostMapping("/saveStudent")
	public String handleRegBtnClick(Student student,Model model) {
		System.out.println(student);
		model.addAttribute("msg", "Student Registered Successfully...!!");
		
		return "dashboard";
	}
}
