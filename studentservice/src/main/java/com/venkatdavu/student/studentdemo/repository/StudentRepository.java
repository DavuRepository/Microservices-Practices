package com.venkatdavu.student.studentdemo.repository;

import com.venkatdavu.student.studentdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

   // Student save(Student student);
}
