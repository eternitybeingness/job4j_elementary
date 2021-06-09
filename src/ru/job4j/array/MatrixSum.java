package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                rsl = rsl + ints[j];
            }
        }
        return rsl;
    }
}