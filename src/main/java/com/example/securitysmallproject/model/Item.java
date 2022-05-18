package com.example.securitysmallproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String item;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product")
    @JsonBackReference
    Product product;
}
