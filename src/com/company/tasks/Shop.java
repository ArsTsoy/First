package com.company.tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Category> categories = new ArrayList<>();
    private String name;

    public Shop(String name) {
        this.name = name;
        setupProductsAndCategory();
    }

    private void setupProductsAndCategory() {
        ArrayList<Product> milkProducts = new ArrayList<>();
        //region UNNECESSARY
        milkProducts.add(
                new Product(
                        "Milk",
                        500,
                        Product.Rating.GOOD
                ));
        milkProducts.add(
                new Product(
                        "Cheese",
                        5000,
                        Product.Rating.GOOD
                ));
        milkProducts.add(
                new Product(
                        "Ice Cream",
                        300,
                        Product.Rating.EXCELLENT
                ));
        //endregion
        categories.add(new Category(
                "Milk",
                milkProducts
        ));

        LinkedList<Product> breadProducts = new LinkedList<>();
        //region UNNECESSARY
        breadProducts.add(
                new Product(
                        "Bread",
                        150,
                        Product.Rating.EXCELLENT
                ));

        breadProducts.add(
                new Product(
                        "Donut",
                        700,
                        Product.Rating.GOOD
                ));
        breadProducts.add(
                new Product(
                        "Bun",
                        400,
                        Product.Rating.NORMAL
                ));
        //endregion
        categories.add(new Category(
                "Bread",
                breadProducts
        ));
    }

    public List<Category> getAvailableCategories() {
        return categories;
    }

    public String getName() {
        return name;
    }
}
