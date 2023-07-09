package com.geekster.ECommerceAPI.controller;

import com.geekster.ECommerceAPI.model.Orders;
import com.geekster.ECommerceAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String createOrder(@RequestBody Orders order){
        orderService.createOrder(order);
        return "Order created";
    }
    @GetMapping("order/{id}")
    public Orders getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }
}
