package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sdacha = money - price;
        for (int coin : coins) {
            while (sdacha - coin >= 0) {
                sdacha -= coin;
                rsl[size] = coin;
                size += 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}