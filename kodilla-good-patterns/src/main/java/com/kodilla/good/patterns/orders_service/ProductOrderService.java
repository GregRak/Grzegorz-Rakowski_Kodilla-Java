package com.kodilla.good.patterns.orders_service;

public class ProductOrderService {

    private OrderService orderService;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(final OrderService orderService, final InformationService informationService, final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getOrderNumber(), orderRequest.getProductName(), orderRequest.getQuantity(), orderRequest.getUser());

        if (isOrdered) {
            informationService.sendEmail(orderRequest);
            informationService.sendSMS(orderRequest);
            orderRepository.saveOrderData(orderRequest.getOrderNumber(), orderRequest.getProductName(), orderRequest.getQuantity(), orderRequest.getUser());
            return new OrderDto(orderRequest.getOrderNumber(), true);
        }
        return new OrderDto (orderRequest.getOrderNumber(), false);
    }
}
