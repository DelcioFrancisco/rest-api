package com.example.rest_api.domain.port.out;

import com.example.rest_api.domain.model.Opportunity;
import com.example.rest_api.dto.OportunityRequestDTO;

import java.util.Optional;

public interface OportunityRepository {

    Optional<Opportunity> findById(Long id);

    void save(OportunityRequestDTO oportunity);
}
