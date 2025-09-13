package com.example.rest_api.service;

import com.example.rest_api.domain.model.Opportunity;
import com.example.rest_api.dto.OportunityRequestDTO;
import com.example.rest_api.dto.OportunityResponseDTO;
import com.example.rest_api.repository.OportunityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OportunityService {
    OportunityRepository oportunityRepository;

    OportunityService(OportunityRepository oportunityRepository) {this.oportunityRepository = oportunityRepository;}

    public OportunityResponseDTO create(OportunityRequestDTO dto) {
        Opportunity opportunity = new Opportunity();

        opportunity.setNameCompany(dto.getNameCompany());
        opportunity.setDescription(dto.getDescription());
        opportunity.setValueCompany(dto.getValueCompany());

        Opportunity saved = oportunityRepository.save(opportunity);

        return toDTO(saved);
    }

    public List<OportunityResponseDTO> findAll(Long id) {
        return oportunityRepository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public  OportunityResponseDTO findbyId(Long id) {
        Opportunity opportunity = oportunityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Oportunidade não encontrada"));

        return toDTO(opportunity);
    }

    private OportunityResponseDTO toDTO(Opportunity entity) {
        OportunityResponseDTO dto = new OportunityResponseDTO();
        dto.setId(entity.getId());
        dto.setNameCompany(entity.getNameCompany());
        dto.setDescription(entity.getDescription());
        dto.setValueCampany(entity.getValueCompany());

        return dto;
    }


}
