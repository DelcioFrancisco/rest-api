package com.example.rest_api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Setter
@Getter
public class OportunityRequestDTO {

    @NotBlank
    private String nameCompany;
    @NotBlank
    private String description;
    @NotBlank
    private BigDecimal valueCompany;
}
