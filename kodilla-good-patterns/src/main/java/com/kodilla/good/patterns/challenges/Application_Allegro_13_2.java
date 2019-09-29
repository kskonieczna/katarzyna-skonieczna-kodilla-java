package com.kodilla.good.patterns.challenges;

public class Application_Allegro_13_2 {

    public static void main(String[] args) {

        PurchaseRequestRetriver_13_2 purchaseRequestRetriver = new PurchaseRequestRetriver_13_2();

        PurchaseRequest_13_2 purchaseRequest = purchaseRequestRetriver.retrieve();


        PurchaseProcessor_13_2 purchaseProcessor = new PurchaseProcessor_13_2(
                new MailService_13_2(),
                new ProductPurchaseService_13_2(),
                new ProductPurchaseRepository_13_2());
        purchaseProcessor.process(purchaseRequest);
    }
}