package com.it.kg.service.implementation;

import com.it.kg.models.Company;
import com.it.kg.repo.CompanyRepository;
import com.it.kg.service.CompanyService;

import javax.transaction.Transactional;

@Transactional
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
    public void deleteById(Long id) {
        CompanyRepository companyRepository = new CompanyRepository();
        companyRepository.deleteById(id);
    }

    @Override
    public void updateById(Long id, Company newCompany) {
        CompanyRepository companyRepository = new CompanyRepository();
        companyRepository.updateById(id, newCompany);
    }

    @Override
    public void clear() {
        CompanyRepository companyRepository = new CompanyRepository();
        companyRepository.clear();
    }
}
