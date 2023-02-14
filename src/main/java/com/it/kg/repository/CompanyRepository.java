package com.it.kg.repository;

import com.it.kg.configuration.HibernateUtil;
import com.it.kg.models.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CompanyRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void save(Company company) {
        try (Session session = sessionFactory.openSession()) {
            session.save(company);

        }
    }

    public Company getByID(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Company.class, id);

        }
    }

    public void updateById(Long id, Company newCompany) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Company c = getByID(id);
            c.setCompanyName(newCompany.getCompanyName());
            c.setCourses(newCompany.getCourses());
            c.setNumberOfStaff(newCompany.getNumberOfStaff());
            session.saveOrUpdate(c);
            session.getTransaction().commit();
        }
    }

    public void clear() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Company c").executeUpdate();
            session.getTransaction().commit();

        }
    }
}
