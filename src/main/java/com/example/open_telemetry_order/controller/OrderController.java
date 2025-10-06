package com.example.open_telemetry_order.controller;

import com.example.open_telemetry_order.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("orders")
public class OrderController {

    @GetMapping("{id}")
    public Order getOrders(@PathVariable int id) {
        return new Order(id, id, LocalDateTime.now(), 10);
    }
}
