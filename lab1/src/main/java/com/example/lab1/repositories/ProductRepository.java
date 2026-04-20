package com.example.lab1.repositories;

import com.example.lab1.common.ProductList;
import com.example.lab1.domain.entitie.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final ProductList productList;

    public List<Product> getProduct(){
        return productList.getProducts();
    }
}
