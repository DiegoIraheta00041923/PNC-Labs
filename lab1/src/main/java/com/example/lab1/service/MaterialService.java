package com.example.lab1.service;

import com.example.lab1.domain.entitie.Material;
import com.example.lab1.repositories.MaterialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MaterialService {
    private final MaterialRepository materialRepository;

    public List<Material> getMaterialsByPrice(){
        return materialRepository.getOrderMaterial();
    }

    public List<Material> getLegendaryMaterials(){
        return materialRepository.getAllLegendary();
    }

    public List<String> getMaterialsLocations(){
        return materialRepository.getLocations();
    }

    public Optional<Material> getExpensiveMaterial(){
        return materialRepository.mostExpensiveMaterial();
    }


}
