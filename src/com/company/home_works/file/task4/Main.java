package com.company.home_works.file.task4;

import java.io.*;
import java.util.Scanner;

public class Main {

    //    Пусть нам необходимо сформировать текстовый файл, который
//    ПЗ вводит с консоли(конец ввода - пустая строка),
//    а затем переписать из данного файла во второй только те строки,
//    которые начинаются с буквы «А» или «а»
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter("src/com/company/home_works/file/task4/FirstText.txt")) {
            String str = scanner.nextLine();
            while (!str.isEmpty()) {
                fileWriter.write(str + "\n");
                str = scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                FileReader fileReader = new FileReader("src/com/company/home_works/file/task4/FirstText.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter("src/com/company/home_works/file/task4/SecondText.txt")
        ) {
            String line = "";
            while (line != null) {
                if (isStartFromA(line)) {
                    fileWriter.write(line + "\n");
                }
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isStartFromA(String s) {
        return s.startsWith("a") || s.startsWith("A");
    }
}
