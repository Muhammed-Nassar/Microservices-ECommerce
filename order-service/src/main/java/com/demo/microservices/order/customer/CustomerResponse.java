package com.demo.microservices.order.customer;

public record CustomerResponse(
    String id,
    String firstname,
    String lastname,
    String email
) {

}
