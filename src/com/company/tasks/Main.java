package com.company.tasks;

import java.util.List;
import java.util.Scanner;

public class Main {

//    а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//    б) Создать класс Категория, имеющий переменные имя и массив товаров.
//    Создать несколько объектов класса Категория.
//    в) Создать класс Basket, содержащий массив купленных товаров.
//    г) Создать класс User, содержащий логин, пароль и объект класса Basket.
//    Создать объект класса User. (Интернет магазин)

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        setupDB();

        Shop shop = new Shop("777");
        System.out.println("Добро пожаловать в магазин " + shop.getName());

        User user = login();
        Category choosedCategory = chooseCategory(shop);
        chooseProduct(shop, choosedCategory, user);
    }

    private static Category chooseCategory(Shop shop) {

        System.out.println("Сегодня доступны такие категории");
        List<Category> categories = shop.getAvailableCategories();
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + " - " + categories.get(i));
        }

        System.out.println("Выберите категорию по номеру: ");
        int choosedCategoryIndex = scanner.nextInt();
        return categories.get(choosedCategoryIndex - 1);
    }

    private static void chooseProduct(Shop shop, Category choosedCategory, User user) {
        System.out.println("В " + choosedCategory.getName() + " сегодня доступны такие товары: ");
        List<Product> availableProducts = choosedCategory.getProducts();
        for (int i = 0; i < availableProducts.size(); i++) {
            System.out.println((i + 1) + " - " + availableProducts.get(i));
        }
        System.out.println("-1 - Выйти в меню выбора категории");
        System.out.println("Выберите товар для добавления в корзину, введя его номер: ");
        int choosedProductIndex = scanner.nextInt();
        if (choosedProductIndex != -1) {
            user.addProduct(availableProducts.get(choosedProductIndex - 1));
            Category newCategory = chooseCategory(shop);
            chooseProduct(shop, newCategory, user);
        } else {
            Category newCategory = chooseCategory(shop);
            chooseProduct(shop, newCategory, user);
        }
    }

    private static void setupDB() {
        UsersDatabase.signUp("ars", "1234567");
        UsersDatabase.signUp("bayan", "password1");
        UsersDatabase.signUp("tolik", "qwerty123");
        UsersDatabase.signUp("dmitriy", "7654321");
    }

    private static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для продолжения введите ваш логин:");
        String login = scanner.next();

        System.out.println("Ввведите ваш пароль от " + login + ":");
        String password = scanner.next();

        User user = UsersDatabase.login(login, password);
        if (user != null) return user;
        else {
            System.out.println("Неверное имя или пароль");
            return login();
        }
    }

}
