package com.company.home_works.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task2 {
//    В текстовом файле посчитать количество строк,
//    а также для каждой отдельной строки определить
//    количество в ней символов и слов.

    public static void main(String[] args) {
        ArrayList<Line> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/company/home_works/file/Text2.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                Line currentLine = new Line(line);
                lines.add(currentLine);
                System.out.println("Символов: " + currentLine.getSymbolAmount() + " -- слов: " + currentLine.getWordsAmount());
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Общее количество строк = " + lines.size());
    }
}
