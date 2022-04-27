package com.example.RestProductService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProductController {

    private final ProductService productService = new ProductService();
    private static final String template = "new product called %s and costs %s zl";
    private final AtomicLong counter = new AtomicLong();

    /*
    create a product based on default values or values chosen by user
    return Product with id, name and price
     */
    @GetMapping("/product")
    public Product getProduct(@RequestParam(value = "name", defaultValue = "Lenovo TV")String name,
                           @RequestParam(value = "price", defaultValue = "7")String price){

        return new Product(counter.incrementAndGet(), String.format(template, name, price), Double.parseDouble(price));
    }

    /*
    a method used to show whole list of products
    ProductService method called getAllProducts contain a full list of products
    method returns list of products
     */

    @GetMapping("/productAll")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    /*
    method to create and add new product
    used method from productService class
    cannot add null
    return add new product
     */
    @PostMapping("/product/add")
    public Product addProduct(@RequestBody Product newProduct){

        return productService.addProduct(newProduct);
    }

}
