package com.company.tasks.exception;

public class LoginIsNotRightException extends Exception {

    public LoginIsNotRightException(String login) {
        super("Такого пользователя " + login + " не существует ");
    }
}
