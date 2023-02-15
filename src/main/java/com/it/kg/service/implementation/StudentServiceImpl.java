package com.it.kg.service.implementation;

import com.it.kg.models.Student;
import com.it.kg.repository.StudentRepository;
import com.it.kg.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public void save(Student student) {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.save(student);
    }

    @Override
    public Student getById(Long id) {
        StudentRepository studentRepository = new StudentRepository();
        return studentRepository.getById(id);
    }

    @Override
    public void updateById(Long id, Student newStudent) {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.updateById(id, newStudent);
    }

    @Override
    public List findAll() {
        StudentRepository studentRepository = new StudentRepository();
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.deleteById(id);
    }

    @Override
    public void clear() {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.clear();
    }
}
