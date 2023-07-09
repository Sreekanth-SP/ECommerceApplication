package com.geekster.ECommerceAPI.controller;

import com.geekster.ECommerceAPI.model.Address;
import com.geekster.ECommerceAPI.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("addresses")
    public String createAddress(@RequestBody Address address){
        addressService.createAddress(address);
        return "Addresses added";
    }
}
