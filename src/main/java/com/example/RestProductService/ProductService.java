package com.example.RestProductService;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    /*
    method to return a list of products
    contains a new list of 3 products as an example
     */
    public List<Product> getAllProducts(){

        //init new list
        List<Product> allProducts = new ArrayList<>();

        //adding some products
        allProducts.add(new Product(1,"MacBook", 200.5 ));
        allProducts.add(new Product(2, "keyboard", 10.99));
        allProducts.add(new Product(3, "dishwasher", 29.50));

        return allProducts;
    }

    /*
    not null
    use setId setter form Product class
    return product object
     */
    public Product addProduct(@NotNull Product newProduct){

        newProduct.setId(4);
        return newProduct;
    }
}
