package com.example.securitysmallproject.service;

import com.example.securitysmallproject.model.Item;
import com.example.securitysmallproject.model.Product;
import com.example.securitysmallproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct() {
        Product product = new Product();
        product.setName("Vegetables");
        product.setPrice("1");
        product.setCurrency("USD");

        Item item = new Item();
        item.setItem("Cucumber");
        item.setProduct(product);
        product.setItems(Arrays.asList(item));

        return productRepository.save(product);
    }


    public Product createProductForItem(){
        Product product = new Product();
        product.setName("Office goods");
        product.setPrice("1");
        product.setCurrency("USD");


        return product;
    }

}
