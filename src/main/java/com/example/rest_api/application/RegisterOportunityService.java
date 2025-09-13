package com.example.rest_api.application;

import com.example.rest_api.domain.port.in.ManageOportunityUseCase;
import com.example.rest_api.domain.port.out.OportunityRepository;
import com.example.rest_api.dto.OportunityRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class RegisterOportunityService implements ManageOportunityUseCase {

    private final OportunityRepository oportunityRepository;

    public RegisterOportunityService(OportunityRepository oportunityRepository) {
        this.oportunityRepository = oportunityRepository;
    }

    @Override
    public void registerOportunity(OportunityRequestDTO oportunity) {
        if (oportunityRepository.findById(oportunity.getValueCompany().longValue()).isPresent()) {
            throw new IllegalArgumentException("Oportunity already exists");
        }
        oportunityRepository.save(oportunity);

    }
}
