package com.it.kg.service.implementation;

import com.it.kg.models.Company;
import com.it.kg.repository.CompanyRepository;
import com.it.kg.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

    @Override
    public void save(Company company) {
        CompanyRepository companyRepository = new CompanyRepository();
        companyRepository.save(company);
    }

    @Override
    public Company getById(Long id) {
        CompanyRepository companyRepository = new CompanyRepository();
        return companyRepository.getByID(id);
    }

    @Override
    public void updateById(Long id, Company newCompany) {

    }

    @Override
    public void clear() {
        CompanyRepository companyRepository = new CompanyRepository();
        companyRepository.clear();

    }
}
