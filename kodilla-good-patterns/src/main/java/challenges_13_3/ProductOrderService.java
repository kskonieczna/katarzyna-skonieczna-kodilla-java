package challenges_13_3;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(Producer producer, Product product) {

        System.out.println("Creating order for " + product.getProductName() + ": Price per unit " + product.getProductPrice() +
                " from: " + producer.getProducerName() + ". Total Order Value: " + product.getProductPrice()*product.getProductQuantity());
        return true;
    }
}