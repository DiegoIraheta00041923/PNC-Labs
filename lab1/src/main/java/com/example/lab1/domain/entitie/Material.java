package com.example.lab1.domain.entitie;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Hace los getters y setters
@Builder
@AllArgsConstructor //Constructor con todos los campos
@NoArgsConstructor

public class Material {
    private String name;
    private String category;
    private String efecto;
    private Double price;
    private String location;
    private String rareza;
}
