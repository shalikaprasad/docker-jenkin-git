package com.msprasad.springmysql.service;

import com.msprasad.springmysql.models.Student;

import java.util.List;

public interface StudentService {

    Student getStudent(Long studentId);

    List<Student> getAllStudent();
}
