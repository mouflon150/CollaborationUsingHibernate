package com.it.kg.repository;

import com.it.kg.configuration.HibernateUtil;
import com.it.kg.models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void save(Student student) {
        try (Session session = sessionFactory.openSession()) {
            session.save(student);
        }
    }

    public Student getById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Student.class, id);
        }
    }

    public void updateById(Long id, Student newStudent) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Student c = getById(id);
            c.setFullName(newStudent.getFullName());
            c.setAge(newStudent.getAge());
            c.setGender(newStudent.getGender());
            session.saveOrUpdate(c);
            session.getTransaction().commit();
        }
    }

    public void deleteById(long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Student student = getById(id);
            session.delete(student);
            session.getTransaction();
        }
    }

    public List findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select c from Student c").getResultList();
        }
    }

    public void clear() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student c ").executeUpdate();
            session.getTransaction().commit();
        }
    }
}