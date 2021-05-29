package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        return h * h * k;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result2);
        double result3 = SqArea.square(10, 1.5);
        System.out.println(" p = 10, k = 1.5, s = " + result3);
    }
}
