package com.kodilla.good.patterns.challenges;

public class PurchaseRequestRetriver_13_2 {

    public PurchaseRequest_13_2 retrieve() {

        User user = new User("John", "Wekl");
        Product product = new Product("Zara", "Dress ABC", "S");

        return new PurchaseRequest_13_2(user, product);
    }
}
