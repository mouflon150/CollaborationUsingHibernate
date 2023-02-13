package com.it.kg.service;

import com.it.kg.models.President;
import com.it.kg.models.Student;

import java.util.List;

public interface StudentService {

    void save(Student student);

    Student getById(Long id);

    void updateById(Long id, Student newStudent);

    List<Student> findAll();

    void deleteById(Long id);

    void clear();
}
