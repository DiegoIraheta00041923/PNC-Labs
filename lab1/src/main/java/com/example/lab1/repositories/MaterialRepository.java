package com.example.lab1.repositories;

import com.example.lab1.common.MaterialList;
import com.example.lab1.domain.entitie.Material;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MaterialRepository {
    private final MaterialList materialList;

    public List<Material> getOrderMaterial(){
        return materialList.getMaterialListByPrice();
    }

    public List<Material> getAllLegendary(){
        return materialList.getLegendaryMaterials();
    }

    public List<String> getLocations(){
        return materialList.getLocationsMaterials();
    }

    public Optional<Material> mostExpensiveMaterial(){
        return materialList.mostExpensive();
    }
}
