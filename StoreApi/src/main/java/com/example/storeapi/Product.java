package com.example.storeapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product extends Store {

    private String productName;
    private String productInfo;
    private double productPrice;
}
