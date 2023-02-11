package com.it.kg.service;

import com.it.kg.models.President;
import com.it.kg.service.serviceImpl.PresidentServiceImpl;

import java.util.List;

public interface PresidentService {

    void save(President president);

    President getById(Long id);
    void updateById(Long id, President newPresident);

    void clear();
}
