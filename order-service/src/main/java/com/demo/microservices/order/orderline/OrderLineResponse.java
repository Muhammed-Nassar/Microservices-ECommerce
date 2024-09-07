package com.demo.microservices.order.orderline;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }
