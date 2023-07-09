package com.geekster.ECommerceAPI.service;

import com.geekster.ECommerceAPI.model.Product;
import com.geekster.ECommerceAPI.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public void createProducts(List<Product> productList) {
            iProductRepo.saveAll(productList);
    }

    public List<Product> getAllProducts() {
        return iProductRepo.findAll();
    }

    public List<Product> getProductByCategory(String category) {
        List<Product> categoryBasedList = new ArrayList<>();
        List<Product> productList = getAllProducts();
        for(Product product:productList){
            if(product.getProductCategory().equals(category)){
                categoryBasedList.add(product);
            }
        }
        return categoryBasedList;
    }

    public void deleteProductById(Long productId) {
        iProductRepo.deleteById(productId);
    }
}
