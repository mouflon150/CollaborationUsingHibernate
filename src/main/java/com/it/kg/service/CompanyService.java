package com.it.kg.service;

import com.it.kg.models.Company;
import com.it.kg.models.President;

import java.util.List;

public interface CompanyService {

    void save(Company company);

    Company getById(Long id);

    void deleteById(Long id);

    void updateById(Long id, Company newCompany);

    void clear();
}
