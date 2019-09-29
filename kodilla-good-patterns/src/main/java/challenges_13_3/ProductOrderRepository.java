package challenges_13_3;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(Producer producer, Product product) {
        return false;
    }
}