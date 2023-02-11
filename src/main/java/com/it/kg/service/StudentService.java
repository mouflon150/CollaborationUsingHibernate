package com.it.kg.service;

import com.it.kg.models.Student;

import java.util.List;

public interface StudentService {

    void save(Student student);

    Student getById(Long id);

    List<Student> findAll();

    void deleteById(Long id);

    void clear();
}
