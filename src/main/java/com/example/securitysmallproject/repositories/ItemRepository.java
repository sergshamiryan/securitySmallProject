package com.example.securitysmallproject.repositories;

import com.example.securitysmallproject.model.Item;
import com.example.securitysmallproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
