package com.hollycrm.order_service.domain;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Product implements Serializable {
    private int id;

    private String name;

    private int price;

    private int store;

    public Product(int id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }
    public Product() {

    }
}
