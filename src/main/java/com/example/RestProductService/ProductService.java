package com.example.RestProductService;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts(){

        List<Product> allProducts = new ArrayList<>();

        allProducts.add(new Product(1,"MacBook", 200.5 ));
        allProducts.add(new Product(2, "keyboard", 10.99));
        allProducts.add(new Product(3, "dishwasher", 29.50));

        return allProducts;
    }

    public Product addProduct(@NotNull Product newProduct){

        newProduct.setId(4);
        return newProduct;
    }
}
