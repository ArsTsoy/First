package com.company.tasks;

public class Product {
    private String name;
    private int price;
    private Rating rating;

    enum Rating {
        EXCELLENT,
        GOOD,
        NORMAL,
        BAD,
        WORST
    }

    public Product(String name, int price, Rating rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
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

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return  name + ": " + price;
    }
}
