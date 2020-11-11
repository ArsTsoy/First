package com.company.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        try {
//            Scanner scanner = new Scanner(System.in);
//            int num = scanner.nextInt();
//            System.out.println("Is valid? = " + isValidPhoneNumber(String.valueOf(num)));
//        } catch (ArsException e) {
//            System.out.println("Неправильная длина номера");
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка, введите числа");
//        } catch (PhoneNumberMinLengthException e) {
//            System.out.println("слишком короткий номер");
//        } catch (Exception e) {
//            System.out.println("Что-то пошло не так");
//        }
//
//        double t = 10;
//        int d = (int)t;

        String s = "sfasnkf";
        s = null;
        //...
        int t = Integer.valueOf(s);



//        getNumberFromConsole();
    }

    private static int getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Вы ввели неправильный формат числа");
            return getNumberFromConsole();
        }
    }

    //region T
    private static void method() throws InputMismatchException {
        if (true) {
            throw new InputMismatchException();
        }
        System.out.println("Программа завершена.");
    }

    private static void method2() throws FileNotFoundException {

        FileReader fileReader = new FileReader("text.txt");

    }
    //endregion

    private static boolean isValidPhoneNumber(String phoneNumber) throws ArsException, PhoneNumberMinLengthException {
        if (phoneNumber.length() == 12) {
            return true;
        } else if (phoneNumber.length() > 12) {
            throw new ArsException();
        } else if (phoneNumber.length() <= 10) {
            throw new PhoneNumberMinLengthException();
        }
        return false;
    }
}
