package com.msprasad.springmysql.service.impl;

import com.msprasad.springmysql.dao.StudentDao;
import com.msprasad.springmysql.models.Student;
import com.msprasad.springmysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public Student getStudent(Long studentId) {
        Optional<Student> student = studentDao.findById(studentId);
        return student.orElse(null);
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentDao.findAll();
    }
}
