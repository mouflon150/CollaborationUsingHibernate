package com.it.kg.service.implementation;

import com.it.kg.models.President;
import com.it.kg.repo.PresidentRepository;
import com.it.kg.service.PresidentService;

import javax.transaction.Transactional;

@Transactional
public class PresidentServiceImpl implements PresidentService {

    private static final PresidentRepository presidentRepo = new PresidentRepository();

    @Override
    public void save(President president) {
        presidentRepo.save(president);
    }

    @Override
    public President getById(Long id) {
        return presidentRepo.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        presidentRepo.deleteById(id);
    }

    @Override
    public void updateById(Long id, President newPresident) {
        presidentRepo.updateById(id, newPresident);
    }

    @Override
    public void clear() {
        presidentRepo.clear();
    }
}