package challenges_13_3;

public class MailService implements InformationService {

    @Override
    public void inform(Producer producer, Product product) {
        System.out.println("Dear " + producer.getProducerName() +
                " please be informed that following order has been made: " +
                    product.getProductName() + ", price: " + product.getProductPrice() +
                        ", quantity: " + product.getProductQuantity());

    }
}