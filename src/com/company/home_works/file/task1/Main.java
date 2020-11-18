package com.company.home_works.file.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        while (true) {
            str = sc.nextLine();
            if (!str.isEmpty()) {
                //Записываем данные
                System.out.println("Записали данные");
//                fileWriter.write(str + "\n"); 
            } else {
                break;
            }
        }

//        while (true) {
//            System.out.println("Enter text: ");
//            String userString = scan.nextLine();
//            boolean string = userString.isEmpty();
//            if (string == true) {
//                System.out.println("Пустая строка");
//            }else {
//                fileWriter.write(userString);
//                fileWriter.close();
//            } 
//        }

    }
}
