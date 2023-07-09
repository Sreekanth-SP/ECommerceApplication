package com.geekster.ECommerceAPI.service;

import com.geekster.ECommerceAPI.model.Address;
import com.geekster.ECommerceAPI.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public void createAddress(Address address) {
        iAddressRepo.save(address);
    }
}
