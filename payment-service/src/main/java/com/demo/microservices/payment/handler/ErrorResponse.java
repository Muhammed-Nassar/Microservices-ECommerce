package com.demo.microservices.payment.handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
