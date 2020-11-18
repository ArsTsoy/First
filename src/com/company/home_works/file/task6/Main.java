package com.company.home_works.file.task6;

import java.io.*;

public class Main {

//    Имеется файл, в котором на каждой новой строке через запятую стоят 2 числа.
//    Сравнить оба числа на каждой строке, и
//    большее число с каждой строки записать в новый файл

    public static void main(String[] args) {
        try (
                FileReader fileReader = new FileReader("src/com/company/home_works/file/task6/FirstText.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter("src/com/company/home_works/file/task6/SecondText.txt")
        ) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] nums = line.split(",");
                fileWriter.write(String.valueOf(getBiggerNum(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]))) + "\n");
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static int getBiggerNum(int first, int second) {
        if(first >= second) {
            return first;
        } else {
            return second;
        }
    }
}
