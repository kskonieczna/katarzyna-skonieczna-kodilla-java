package challenges_13_3;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();

        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        String producerId = orderRequest.getProducer().getProducerId();

        switch (producerId) {
            case "EFS":
                EFS_Processor efs_processor = new EFS_Processor(
                        new MailService(),
                        new ProductOrderService(),
                        new ProductOrderRepository());
                efs_processor.process(orderRequest);
                break;
            case "GFS":
                GFS_Processor gfs_processor = new GFS_Processor(
                        new SmsService(),
                        new ProductOrderService(),
                        new ProductOrderRepository());
                gfs_processor.process(orderRequest);
                break;
            case "HS":
                HS_Processor hs_processor = new HS_Processor(
                        new MailService(),
                        new ProductOrderService(),
                        new ProductOrderRepository());
                hs_processor.process(orderRequest);
                break;
            default:
                break;
        }
    }
}