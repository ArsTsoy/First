package com.company.oop_tasks.task2;

public class Main {

//    1 2 5      2 3 5      3 5 10
//    4 13 2  +  1 9 10  =  5 22 12
//    9 10 8     12 3 4     21 13 12

    public static void main(String[] args) {

        int[][] elem1 = new int[][] {
                new int[]{1, 2, 3},
                new int[]{5, 8, 3},
                new int[]{10, 1, 4}
        };

        int[][] elem2 = new int[][] {
                new int[]{10, 2, 3},
                new int[]{7, 8, 9},
                new int[]{11, 8, 6}
        };

        Matrix matrix1 = new Matrix(elem1);
        Matrix matrix2 = new Matrix(elem2);
        Matrix res = matrix1.sum(matrix2);
        System.out.println(res);
    }
}
