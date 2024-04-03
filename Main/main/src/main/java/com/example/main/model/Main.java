package com.example.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Main {
    @Id
    private int id;
    private String name;
    private int price;
    private String type;
    private int quantity;

    public Main() {

    }

    public Main(int id, String name, int price, String type, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
