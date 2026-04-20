package com.example.lab1.domain.entitie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Hace los getters y setters
@Builder
@AllArgsConstructor //Constructor con todos los campos
@NoArgsConstructor //Constructor sin ningun parameto

public class Product {
    private Long id;
    private String name;
    private Double price;
}
