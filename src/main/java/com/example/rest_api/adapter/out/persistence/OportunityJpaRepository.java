package com.example.rest_api.adapter.out.persistence;

import com.example.rest_api.domain.model.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OportunityJpaRepository extends JpaRepository<Opportunity, Long> {
}
