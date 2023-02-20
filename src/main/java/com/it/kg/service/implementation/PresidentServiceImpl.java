package com.it.kg.service.implementation;

import com.it.kg.models.President;
import com.it.kg.repo.PresidentRepository;
import com.it.kg.service.PresidentService;

import javax.transaction.Transactional;

@Transactional
public class PresidentServiceImpl implements PresidentService {

    @Override
    public void save(President president) {
        PresidentRepository presidentRepository = new PresidentRepository();
        presidentRepository.save(president);
    }

    @Override
    public President getById(Long id) {
        PresidentRepository presidentRepository = new PresidentRepository();
        return presidentRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        PresidentRepository presidentRepository = new PresidentRepository();
        presidentRepository.deleteById(id);
    }

    @Override
    public void updateById(Long id, President newPresident) {
        PresidentRepository presidentRepository = new PresidentRepository();
        presidentRepository.updateById(id, newPresident);
    }

    @Override
    public void clear() {
        PresidentRepository presidentRepository = new PresidentRepository();
        presidentRepository.clear();
    }
}