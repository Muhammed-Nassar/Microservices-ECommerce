package com.demo.microservices.order.payment;

import com.demo.microservices.order.customer.CustomerResponse;
import com.demo.microservices.order.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
