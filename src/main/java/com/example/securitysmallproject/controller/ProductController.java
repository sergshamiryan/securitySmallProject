package com.example.securitysmallproject.controller;

import com.example.securitysmallproject.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping
//    curl.exe http://localhost:8080/product | jq
    ResponseEntity<?> getProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PostMapping
    ResponseEntity<?> addProduct() {
        return ResponseEntity.ok(productService.addProduct());
    }
}
