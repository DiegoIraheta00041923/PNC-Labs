package com.example.lab1.common;

import com.example.lab1.domain.entitie.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductList {
    private final List<Product> products;

    public ProductList(List<Product> products){
        this.products = products;

        this.products.add(Product.builder()
                .id(1L)
                .name("Laptop")
                .price(850.50)
                .build());

        this.products.add(Product.builder()
                .id(2L)
                .name("Mouse")
                .price(19.99)
                .build());

        this.products.add(Product.builder()
                .id(3L)
                .name("Teclado")
                .price(45.00)
                .build());

        this.products.add(Product.builder()
                .id(4L)
                .name("Monitor")
                .price(199.90)
                .build());
    }

    public List<Product> getProducts() {
        return products;
    }
}
