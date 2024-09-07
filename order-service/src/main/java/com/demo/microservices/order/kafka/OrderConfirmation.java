package com.demo.microservices.order.kafka;

import com.demo.microservices.order.customer.CustomerResponse;
import com.demo.microservices.order.order.PaymentMethod;
import com.demo.microservices.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
