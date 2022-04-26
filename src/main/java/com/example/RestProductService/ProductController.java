package com.example.RestProductService;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProductController {

    private ProductService productService = new ProductService();
    private static final String template = "new product called %s and costs %s zl";
    private AtomicLong counter = new AtomicLong();
    private double productPrice = 7.0;


    @GetMapping("/product")
    public Product getProduct(@RequestParam(value = "name", defaultValue = "Lenovo TV")String name,
                           @RequestParam(value = "price", defaultValue = "7")String price){

        return new Product(counter.incrementAndGet(), String.format(template, name, price), productPrice);
    }


    @GetMapping("/productAll")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }


    @PostMapping("/product/add")
    public Product addProduct(@RequestBody Product newProduct){

        return productService.addProduct(newProduct);
    }

}
