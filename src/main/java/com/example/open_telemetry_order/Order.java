package com.example.open_telemetry_order;

import module java.base;

public record Order(
        int id,
        int customerId,
        LocalDateTime orderDate,
        double totalAmount
) {
}
