package com.it.kg.repository;

import com.it.kg.configuration.HibernateUtil;
import com.it.kg.models.Company;
import com.it.kg.models.President;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PresidentRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void save(President president) {
        try (Session session = sessionFactory.openSession()) {
            session.save(president);
        }
    }

    public President getById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(President.class, id);
        }
    }

    public void updateById(Long id, President newPresident) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            President p = getById(id);
            p.setFullName(newPresident.getFullName());
            p.setAge(newPresident.getAge());
            p.setGender(newPresident.getGender());
//            p.setCompany(newPresident.getCompany());
            session.saveOrUpdate(p);
            session.getTransaction().commit();
        }
    }

    public void clear() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from President p").executeUpdate();
            session.getTransaction().commit();
        }
    }
}