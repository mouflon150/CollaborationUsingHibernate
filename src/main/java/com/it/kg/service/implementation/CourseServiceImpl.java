package com.it.kg.service.implementation;

import com.it.kg.models.Course;
import com.it.kg.repo.CourseRepository;
import com.it.kg.service.CourseService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CourseServiceImpl implements CourseService {

    private static final CourseRepository courseRepo = new CourseRepository();

    @Override
    public void save(Course course) {
        courseRepo.save(course);
    }

    @Override
    public Course getById(Long id) {
        return courseRepo  .getById(id);
    }

    @Override
    public void updateById(Long id, Course newCourse) {
        courseRepo.updateById(id, newCourse);
    }

    @Override
    public List findAll() {
        return courseRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        courseRepo.deleteById(id);
    }

    @Override
    public void clear() {
        courseRepo.clear();
    }
}