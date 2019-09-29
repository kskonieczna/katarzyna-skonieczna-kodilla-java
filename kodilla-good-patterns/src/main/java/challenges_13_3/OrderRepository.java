package challenges_13_3;

public interface OrderRepository {

    boolean createOrder(Producer producer, Product product);
}