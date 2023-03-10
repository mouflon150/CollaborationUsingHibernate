package com.it.kg.repo;

import com.it.kg.configuration.HibernateUtil;
import com.it.kg.models.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CourseRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void save(Course course) {
        try (Session session = sessionFactory.openSession()) {
            session.save(course);
        }
    }

    public Course getById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Course.class, id);
        }
    }

    public void updateById(Long id, Course newCourse) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Course c = getById(id);
            c.setCourseName(newCourse.getCourseName());
            c.setStaff(newCourse.getStaff());
            session.saveOrUpdate(c);
            session.getTransaction().commit();
        }
    }

    public void deleteById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Course course = getById(id);
            if (course == null) {
                throw new IllegalArgumentException("Cannot delete course with id " + id + ". Course not found.");
            }
            session.delete(course);
            session.getTransaction().commit();
        }
    }


    public List findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select c from Course c").getResultList();
        }
    }

    public void clear() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Course c").executeUpdate();
            session.getTransaction().commit();
        }
    }
}