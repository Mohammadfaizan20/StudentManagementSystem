package com.Student;

import com.Student.entity.Student;
import com.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {


//		Student student1 = new Student("mohammad","faizan","faizan@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("mohammad","rizwan","rizwan@gmail.com");
//		studentRepository.save(student2);




	}
}
