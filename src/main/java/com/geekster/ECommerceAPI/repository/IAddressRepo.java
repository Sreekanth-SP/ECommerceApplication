package com.geekster.ECommerceAPI.repository;

import com.geekster.ECommerceAPI.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends  JpaRepository<Address,Long>  {
}
