package com.kodilla.good.patterns.challenges;

public class Product {

    private String brand;
    private String model;
    private String size;

    public Product(String brand, String model, String size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }
}
