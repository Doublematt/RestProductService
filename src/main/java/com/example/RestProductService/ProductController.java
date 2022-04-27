package com.example.RestProductService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProductController {

    private final ProductService productService = new ProductService();
    private static final String template = "new product called %s and costs %s zl";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/product")
    public Product getProduct(@RequestParam(value = "name", defaultValue = "Lenovo TV")String name,
                           @RequestParam(value = "price", defaultValue = "7")String price){

        return new Product(counter.incrementAndGet(), String.format(template, name, price), Double.parseDouble(price));
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
