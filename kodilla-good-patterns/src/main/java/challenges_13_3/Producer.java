package challenges_13_3;

public class Producer {

    private String producerName;
    private String producerId;

    public Producer(String producerName, String producerId) {
        this.producerName = producerName;
        this.producerId = producerId;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProducerId() {
        return producerId;
    }
}
