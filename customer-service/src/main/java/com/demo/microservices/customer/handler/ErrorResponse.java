package com.demo.microservices.customer.handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
