package com.kodilla.good.patterns.challenges;

public class PurchaseRequest_13_2 {

    private User user;
    private Product product;

    public PurchaseRequest_13_2(final User user, final Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}