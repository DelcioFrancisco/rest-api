package com.example.rest_api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class OportunityResponseDTO {
    private Long id;
    private String nameCompany;
    private String description;
    private BigDecimal valueCampany;
}


