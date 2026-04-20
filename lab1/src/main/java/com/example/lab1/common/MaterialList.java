package com.example.lab1.common;

import com.example.lab1.domain.entitie.Material;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class MaterialList {
    private final List<Material> materialList;

    public MaterialList (List<Material> materialList){
        this.materialList = materialList;

        this.materialList.add(Material.builder()
                .name("Sandwich")
                .category("Comida")
                .efecto("Estamina")
                .price(20.0)
                .location("Cordillera de Hebra")
                .rareza("Comun")
                .build()
        );

        this.materialList.add(Material.builder()
                .name("Hongo")
                .category("Comida")
                .efecto("Estamina")
                .price(15.0)
                .location("Cordillera de Hebra")
                .rareza("Comun")
                .build()
        );
        this.materialList.add(Material.builder()
                .name("cola de lagarto")
                .category("Parte de Monstruo")
                .efecto("Corazones")
                .price(35.0)
                .location("Volcán de Eldin")
                .rareza("Raro")
                .build()
        );
        this.materialList.add(Material.builder()
                .name("Flor de loto")
                .category("Planta")
                .efecto("Corazones")
                .price(100.0)
                .location("Cordillera de Hebra")
                .rareza("Legendario")
                .build()
        );
        this.materialList.add(Material.builder()
                .name("Black Lotus")
                .category("Planta")
                .efecto("Ataque")
                .price(150.0)
                .location("Volcan de Eldin")
                .rareza("Legendario")
                .build()
        );
    }

    public List<Material> getMaterialListByPrice(){
        return materialList.stream()
                .sorted((m1,m2) -> Double.compare(m2.getPrice(),m1.getPrice()))
                .toList();
    }


    public List<Material> getLegendaryMaterials(){
        return materialList.stream().filter(m -> m.getRareza().equals("Legendario")).toList();
    }

    public List<String> getLocationsMaterials(){
        return materialList.stream().filter(m -> m.getLocation() != null).collect(Collectors.toMap(
                Material::getLocation,
                m->m,
                (alredy, newLocation) -> alredy
        )).values().stream().map(Material::getLocation).toList();
    }

    public Optional<Material> mostExpensive(){
        return materialList.stream().max(Comparator.comparingDouble(Material::getPrice));
    }
}
