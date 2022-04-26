package com.example.RestProductService;

public class Product {

    private long id;
    private String productName;
    private double price;

    public Product(long id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

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
