package com.example.lab2.repository;

import com.example.lab2.domain.entity.Hechicero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HechiceroRepository extends JpaRepository<Hechicero, UUID> {
}

