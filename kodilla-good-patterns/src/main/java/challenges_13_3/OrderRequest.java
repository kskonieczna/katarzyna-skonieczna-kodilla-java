package challenges_13_3;

public class OrderRequest {
    private Product product;
    private Producer producer;

    public OrderRequest(final Product product, final Producer producer) {
        this.product = product;
        this.producer = producer;
    }

    public Product getProduct() {
        return product;
    }

    public Producer getProducer() {
        return producer;
    }
}
