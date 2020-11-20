package com.company.tasks;

import java.util.ArrayList;
import java.util.List;

public class UsersDatabase {
    private UsersDatabase() {}

    private final static List<User> ALL_USERS = new ArrayList<>();

    public static User login(String login, String password) {
        for(User user : ALL_USERS) {
            if(user.checkLoginAndPassword(login, password)) {
                return user;
            }
        }
        return null;
    }

    public static void signUp(String login, String password) {
        ALL_USERS.add(new User(login, password));
    }
}
