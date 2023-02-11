package com.it.kg.service;

import com.it.kg.models.Course;

import java.util.List;

public interface CourseService {

    void save(Course course);

    Course getById(Long id);

    List<Course> findAll();

    void deleteById(Long id);

    void clear();
}
