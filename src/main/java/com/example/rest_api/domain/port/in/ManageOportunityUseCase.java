package com.example.rest_api.domain.port.in;

import com.example.rest_api.dto.OportunityRequestDTO;

public interface ManageOportunityUseCase {
    void registerOportunity(OportunityRequestDTO oportunity);
}
