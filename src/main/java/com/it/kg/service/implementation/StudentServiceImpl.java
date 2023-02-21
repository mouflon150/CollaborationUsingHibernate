package com.it.kg.service.implementation;

import com.it.kg.models.Student;
import com.it.kg.repo.PresidentRepository;
import com.it.kg.repo.StudentRepository;
import com.it.kg.service.StudentService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class StudentServiceImpl implements StudentService {

    private static final StudentRepository studentRepo = new StudentRepository();

    @Override
    public void save(Student student) {
        studentRepo.save(student);
    }

    @Override
    public Student getById(Long id) {
        return studentRepo.getById(id);
    }

    @Override
    public void updateById(Long id, Student newStudent) {
        studentRepo.updateById(id, newStudent);
    }

    @Override
    public List findAll() {
        return studentRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public void clear() {
        studentRepo.clear();
    }
}
