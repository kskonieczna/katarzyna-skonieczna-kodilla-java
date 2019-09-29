package challenges_13_3;

public class EFS_Processor implements OrderProcessor{
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public EFS_Processor(final InformationService informationService, final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isAvailable = orderService.order(orderRequest.getProducer(), orderRequest.getProduct());

        if(isAvailable) {
            informationService.inform(orderRequest.getProducer(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getProducer(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getProduct(), false);
        }
    }
}