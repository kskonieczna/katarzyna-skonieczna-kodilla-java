package com.kodilla.good.patterns.challenges;

public class PurchaseProcessor_13_2 {
    private InformationService informationService;
    private PurchaseService_13_2 productPurchaseService;
    private PurchaseRepository_13_2 productPurchaseRepository;

    public PurchaseProcessor_13_2(final InformationService informationService,
                           final PurchaseService_13_2 productPurchaseService,
                           final PurchaseRepository_13_2 productPurchaseRepository) {
        this.informationService = informationService;
        this.productPurchaseService = productPurchaseService;
        this.productPurchaseRepository = productPurchaseRepository;
    }

    public PurchaseDto_13_2 process(final PurchaseRequest_13_2 purchaseRequest) {
        boolean isAvailable = productPurchaseService.purchase(purchaseRequest.getUser(), purchaseRequest.getProduct());

        if(isAvailable) {
            informationService.inform(purchaseRequest.getUser());
            productPurchaseRepository.createPurchase(purchaseRequest.getUser(), purchaseRequest.getProduct());
            return new PurchaseDto_13_2(purchaseRequest.getUser(), true);
        } else {
            return new PurchaseDto_13_2(purchaseRequest.getUser(), false);
        }
    }
}
