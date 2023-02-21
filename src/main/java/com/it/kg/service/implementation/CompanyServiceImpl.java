package com.it.kg.service.implementation;

import com.it.kg.models.Company;
import com.it.kg.repo.CompanyRepository;
import com.it.kg.service.CompanyService;

import javax.transaction.Transactional;

@Transactional
public class CompanyServiceImpl implements CompanyService {

    private static final CompanyRepository companyRepo = new CompanyRepository();

    @Override
    public void save(Company company) {
        companyRepo.save(company);
    }

    @Override
    public Company getById(Long id) {
        return companyRepo.getByID(id);
    }

    @Override
    public void deleteById(Long id) {
        companyRepo.deleteById(id);
    }

    @Override
    public void updateById(Long id, Company newCompany) {
        companyRepo.updateById(id, newCompany);
    }

    @Override
    public void clear() {
        companyRepo.clear();
    }
}
