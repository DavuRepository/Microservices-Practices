package com.venkatdavu.student.studentdemo.service;

import com.venkatdavu.student.studentdemo.model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}
