package com.example.open_telemetry_order.controller;

import com.example.open_telemetry_order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
