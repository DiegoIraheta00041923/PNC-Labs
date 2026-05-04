package com.example.lab2.service;

import com.example.lab2.domain.entity.Hechicero;

import java.util.UUID;

public interface HechiceroService {
    void createHechicero(Hechicero hechicero);

    void getHechiceros();
    void getHechiceroByID(UUID id);
    void updateHechiero(Hechicero hechicero);
    void deleteHechicero(UUID id);
    void getHechicerosBySchool(String school);
    void getHechicerosByGrade(String grade);
    void getActiveHechiceros(Boolean active);
}
