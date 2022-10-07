package com.qa.java.oop;

public class Product {

    int id;
    String name;
    float price;
    String category;
    byte rating;
    float  discountPercentage;
    boolean isAvailable;

    Product(){

    }

    public Product(int id, String name, float price, String category, byte rating, float discountPercentage, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
    }
}
