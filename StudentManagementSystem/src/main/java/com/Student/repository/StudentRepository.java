package com.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
