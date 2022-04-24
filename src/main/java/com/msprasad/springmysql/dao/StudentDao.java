package com.msprasad.springmysql.dao;

import com.msprasad.springmysql.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student, Long> {

}
