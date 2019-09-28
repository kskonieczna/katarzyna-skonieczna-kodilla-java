package com.kodilla.good.patterns.challenges;

public class ProductPurchaseService_13_2 implements PurchaseService_13_2{

    public boolean purchase(final User user, final Product product){
        System.out.println("Creating purchase for: " + user.getName() + user.getSurname()
                + ", product purchased: " + product.getBrand() + ": " + product.getModel() + ", size: " + product.getSize());
        return true;
    }
}
