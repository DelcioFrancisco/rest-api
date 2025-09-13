package com.example.rest_api.repository;

import com.example.rest_api.domain.model.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OportunityRepository extends JpaRepository <Opportunity, Long> {

}
