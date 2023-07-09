package com.geekster.ECommerceAPI.service;

import com.geekster.ECommerceAPI.model.Orders;
import com.geekster.ECommerceAPI.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public void createOrder(Orders order) {
        iOrderRepo.save(order);
    }

    public Orders getOrderById(Long id) {
        return iOrderRepo.getReferenceById(id);
    }
}
