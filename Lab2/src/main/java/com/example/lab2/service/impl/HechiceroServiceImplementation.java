package com.example.lab2.service.impl;

import com.example.lab2.domain.entity.Hechicero;
import com.example.lab2.repository.HechiceroRepository;
import com.example.lab2.service.HechiceroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HechiceroServiceImplementation implements HechiceroService {
    private final HechiceroRepository hechiceroRepository;

    @Override
    public void createHechicero(Hechicero hechicero){
        hechiceroRepository.save(hechicero);
    }

    @Override
    public List<Hechicero> getHechiceros(){
        return hechiceroRepository.findAll();
    }
    @Override
    Hechicero getHechiceroByID(UUID id);
    @Override
    void updateHechiero(Hechicero hechicero);
    @Override
    void deleteHechicero(UUID id);
    @Override
    void getHechicerosBySchool(String school);
    @Override
    void getHechicerosByGrade(String grade);
    @Override
    void getActiveHechiceros(Boolean active);
}
