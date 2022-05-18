package com.example.securitysmallproject.service;

import com.example.securitysmallproject.model.Item;
import com.example.securitysmallproject.model.Product;
import com.example.securitysmallproject.repositories.ItemRepository;
import com.example.securitysmallproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ItemServiceImpl {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductServiceImpl productService;

    public List<Item> getAllProducts(){
        return itemRepository.findAll();
    }


    public Item addItem(){
        String productName = "Office goods";
        String itemName = "Pen";

        Item item = new Item();
        item.setItem(itemName);
        Product product = productRepository.findByName(productName);
        if (product != null){
            item.setProduct(product);
        }else{
//            product = new Product();
//            product.setName(productName);
//            product.setCurrency("USD");
//            product.setPrice("100");
              item.setProduct(productService.createProductForItem()); //BOTH commented above and this line works
        }
        Item itemDb = itemRepository.save(item);

        return itemDb;
    }

}
