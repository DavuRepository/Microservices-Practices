package com.venkatdavu.student.studentdemo.controller;

import com.venkatdavu.student.studentdemo.model.Student;
import com.venkatdavu.student.studentdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/hello")
    public String greeting() {
        return "Hello.... Welcome to rental car";
    }

    @PostMapping(value = "/student")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping(value = "/student/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id) {

        Student student = studentService.fetchStudentById(id);
        if (student == null) {
           return ResponseEntity.notFound().build();
        } else {
           return ResponseEntity.ok().body(student);
        }
    }
}
