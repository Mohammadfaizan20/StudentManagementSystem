package com.Student.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Student.entity.Student;
import com.Student.repository.StudentRepository;
import com.Student.services.StudentService;

@Service
public class StudentServiceimpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	public StudentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {

		studentRepository.deleteById(id);

	}


}
