package com.company.tasks;

import com.company.tasks.exception.LoginIsNotRightException;

public class User {

    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public int addProduct(Product product) {
        return basket.addProduct(product);
    }

    //region USER DATA
    public boolean checkLoginAndPassword(String login, String password) {
        return this.login.toLowerCase().equals(login.toLowerCase()) && this.password.equals(password);
    }

    public boolean resetPassword(
            String login,
            String newPassword
    ) throws LoginIsNotRightException {
        if(login.equals(this.login)) {
            this.password = newPassword;
            return true;
        } else {
            throw new LoginIsNotRightException(login);
        }
//        return false;
    }
    //endregion

}
