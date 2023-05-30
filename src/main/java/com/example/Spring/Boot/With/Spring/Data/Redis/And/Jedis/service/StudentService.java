package com.example.Spring.Boot.With.Spring.Data.Redis.And.Jedis.service;

import com.example.Spring.Boot.With.Spring.Data.Redis.And.Jedis.model.Student;

import java.util.List;

public interface StudentService {

    Boolean saveStudent(Student student);

    List<Student> fetchAllStudents();

    Student fetchStudentById(long id);
}
