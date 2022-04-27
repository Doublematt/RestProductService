package com.example.RestProductService;

public class Product {

    // creating variables without default values
    private long id;
    private final String productName;
    private final double price;

    //init by constructor
    public Product(long id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }


    //getters and setters
    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }
}
