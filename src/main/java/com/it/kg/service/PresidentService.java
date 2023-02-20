package com.it.kg.service;

import com.it.kg.models.President;

public interface PresidentService {

    void save(President president);

    President getById(Long id);

    void deleteById(Long id);

    void updateById(Long id, President newPresident);

    void clear();
}
