package com.geekster.ECommerceAPI.repository;

import com.geekster.ECommerceAPI.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Orders,Long> {
}
