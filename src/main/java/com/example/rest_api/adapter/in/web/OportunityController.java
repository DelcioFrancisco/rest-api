package com.example.rest_api.adapter.in.web;

import com.example.rest_api.dto.OportunityRequestDTO;
import com.example.rest_api.dto.OportunityResponseDTO;
import com.example.rest_api.repository.OportunityRepository;
import com.example.rest_api.service.OportunityService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/oportunities")
public class OportunityController {
    private OportunityRepository oportunities;
    private OportunityService oportunityService;

    OportunityController(OportunityRepository oportunities, OportunityService oportunityService) {
        this.oportunities = oportunities;
        this.oportunityService = oportunityService;
    }

    @GetMapping
    public List<OportunityResponseDTO> getAllOportunities(Long id) {
        return oportunityService.findAll(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OportunityResponseDTO> getById(@PathVariable Long id) {
        OportunityResponseDTO response = oportunityService.findbyId(id);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OportunityResponseDTO createUser(@RequestBody @Valid OportunityRequestDTO oportunityRequestDTO) {
        return oportunityService.create(oportunityRequestDTO);
    }
}
