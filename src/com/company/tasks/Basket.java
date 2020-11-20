package com.company.tasks;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Product> products = new ArrayList<>();

    public Basket(List<Product> products) {
        this.products = products;
    }
    public Basket() {
    }

    public int addProduct(Product product) {
        products.add(product);
        return products.size();
    }
}
