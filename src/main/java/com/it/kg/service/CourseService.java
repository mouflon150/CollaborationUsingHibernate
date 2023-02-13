package com.it.kg.service;

import com.it.kg.models.Course;
import com.it.kg.models.President;

import java.util.List;

public interface CourseService {

    void save(Course course);

    Course getById(Long id);

    void updateById(Long id, Course newCourse);

    List<Course> findAll();

    void deleteById(Long id);

    void clear();
}
