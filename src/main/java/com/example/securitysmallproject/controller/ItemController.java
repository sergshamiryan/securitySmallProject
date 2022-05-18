package com.example.securitysmallproject.controller;

import com.example.securitysmallproject.service.ItemServiceImpl;
import com.example.securitysmallproject.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemServiceImpl itemService;

    @GetMapping
//  curl.exe http://localhost:8080/item | jq
    ResponseEntity<?> getItems() {
        return ResponseEntity.ok(itemService.getAllProducts());
    }

    @PostMapping
    ResponseEntity<?> addItems(){
        return ResponseEntity.ok(itemService.addItem());
    }
}
