package com.geekster.ECommerceAPI.controller;

import com.geekster.ECommerceAPI.model.Product;
import com.geekster.ECommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("products")
    public String createProducts(@RequestBody List<Product> productList){
        productService.createProducts(productList);
        return "Products Added";
    }

    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("products/category/{category}")
    public List<Product>  getProductByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }

    @DeleteMapping("product/id/{productId}")
    public String deleteProductById(@PathVariable Long productId){
        productService.deleteProductById(productId);
        return "Product Deleted";
    }
}
