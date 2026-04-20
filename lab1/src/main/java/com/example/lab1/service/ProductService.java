package com.example.lab1.service;

import com.example.lab1.domain.entitie.Product;
import com.example.lab1.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.getProduct();
    }
}
