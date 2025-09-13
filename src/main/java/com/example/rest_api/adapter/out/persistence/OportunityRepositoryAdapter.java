package com.example.rest_api.adapter.out.persistence;

import com.example.rest_api.domain.model.Opportunity;
import com.example.rest_api.domain.port.out.OportunityRepository;
import com.example.rest_api.dto.OportunityRequestDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OportunityRepositoryAdapter implements OportunityRepository {

    private final OportunityJpaRepository jpaRepo;

    public OportunityRepositoryAdapter(OportunityJpaRepository jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    @Override
    public Optional<Opportunity> findById(Long id) {
        return jpaRepo.findById(id).map(entity -> new Opportunity());
    }

    @Override
    public void save(OportunityRequestDTO oportunity) {

    }
}
