package com.msprasad.springmysql.controllers;

import com.msprasad.springmysql.models.Student;
import com.msprasad.springmysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Long studentId) {
        return studentService.getStudent(studentId);
    }

    @GetMapping(path = "all")
    public List<Student> getStudent() {
        return studentService.getAllStudent();
    }
}
