package com.it.kg.service;

import com.it.kg.models.Company;

import java.util.List;

public interface CompanyService {

    void save(Company company);

    Company getById(Long id);

    void clear();
}
