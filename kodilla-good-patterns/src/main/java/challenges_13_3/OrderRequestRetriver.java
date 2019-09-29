package challenges_13_3;

public class OrderRequestRetriver {

    public OrderRequest retrieve() {

        Product product = new Product("Milk",1.99,20);
        Producer producer = new Producer("ExtraFoodShop","EFS");

        return new OrderRequest(product, producer);
    }
}