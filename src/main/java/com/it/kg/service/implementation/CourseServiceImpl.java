package com.it.kg.service.implementation;

import com.it.kg.models.Course;
import com.it.kg.repo.CourseRepository;
import com.it.kg.service.CourseService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CourseServiceImpl implements CourseService {

    @Override
    public void save(Course course) {
        CourseRepository courseRepository = new CourseRepository();
        courseRepository.save(course);
    }

    @Override
    public Course getById(Long id) {
        CourseRepository courseRepository = new CourseRepository();
        return courseRepository.getById(id);
    }

    @Override
    public void updateById(Long id, Course newCourse) {
        CourseRepository courseRepository = new CourseRepository();
        courseRepository.updateById(id, newCourse);
    }

    @Override
    public List findAll() {
        CourseRepository courseRepository = new CourseRepository();
        return courseRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        CourseRepository courseRepository = new CourseRepository();
        courseRepository.deleteById(id);
    }

    @Override
    public void clear() {
        CourseRepository courseRepository = new CourseRepository();
        courseRepository.clear();
    }
}