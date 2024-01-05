package com.Student.controllers;

import com.Student.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Student.services.StudentService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	@GetMapping("/student")
	public String AllStudents(Model model) {
		model.addAttribute("student",studentService.getAllStudents());
		return "student";
		
	}

	@GetMapping("/student/new_student")
	public  String NewStudent(Model model)
	{
		//student object store data
		Student student = new Student();

		model.addAttribute("student",student);
		return "new_student";

	}

	@PostMapping("/student")
	public String SaveStudent(@ModelAttribute("student") Student student){

		studentService.saveStudent(student);
		System.out.println("student added suseefullyy...."+student.getEmail()+student.getFirstName()+student.getLastName()+student.getId());
		return "redirect:/student";
	}


	@GetMapping("/student/edit/{id}")
	public String editStudent(@PathVariable Long id,Model model){

		model.addAttribute("student",studentService.getStudentById(id));

		return "edit_student";
	}

	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Long id,
								@ModelAttribute("student") Student student,
								Model model){

		Student existingStudent = studentService.getStudentById(id);

		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setId(student.getId());

		studentService.updateStudent(existingStudent);

		return "redirect:/student";
	}



	@GetMapping("/student/{id}")
	public String deleteStudent(@PathVariable Long id){

		studentService.deleteStudentById(id);
		return "redirect:/student";
	}

	

}
