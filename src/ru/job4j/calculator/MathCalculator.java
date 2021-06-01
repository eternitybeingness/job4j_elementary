package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivis(double first, double second) {
        return diff(first, second)
                + divis(first, second);
    }

    public static double sumThemAll(double first, double second) {
        return sumAndMultiply(first, second)
                + diffAndDivis(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма + произведение равны: " + sumAndMultiply(10, 20));
        System.out.println("Разность + деление равны: " + diffAndDivis(10, 20));
        System.out.println("Сумма всех 4 опереаций равны: " + sumThemAll(10, 20));
    }
}
