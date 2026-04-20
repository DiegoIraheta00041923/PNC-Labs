package com.example.lab1;

import com.example.lab1.domain.entitie.Material;
import com.example.lab1.service.MaterialService;
import com.example.lab1.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class Lab1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab1Application.class, args);
    }

    @Bean
    public CommandLineRunner run(MaterialService materialService) {

        return args -> {

            System.out.println("=== INICIANDO APP ===");
            materialService.getMaterialsByPrice().forEach(m ->
                    System.out.println("[HYRULE-DB] " + "Nombre: "+ m.getName() + " | Categoria: " + m.getCategory() + "| Precio: " + m.getPrice() + " Rupias")
            );

            System.out.println("=== Grado Legendario ===");
            materialService.getLegendaryMaterials().forEach(m ->
                    System.out.println("[HYRULE-DB] " + "Nombre: "+ m.getName() + " | Categoria: " + m.getCategory() + "| Precio: " + m.getPrice() + " Rupias")
            );

            System.out.println("=== Locations ===");
            materialService.getMaterialsLocations().forEach(m ->
                    System.out.println("[HYRULE-DB] " + m)
            );

            System.out.println("=== Más caro APP ===");
                Optional<Material> material = materialService.getExpensiveMaterial();
                if(material.isPresent()) {
                    Material m = material.get();
                    System.out.println("[HYRULE-DB] " + "Nombre: " + m.getName() + " | Categoria: " + m.getCategory() + "| Precio: " + m.getPrice() + " Rupias");
                }
        };
    }

}
