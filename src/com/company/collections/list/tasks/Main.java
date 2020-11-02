package com.company.collections.list.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String color = scanner.next();
            if(!color.equals("#stop")) {
                colors.add(color);
            } else {
                break;
            }
        }
    }
}
