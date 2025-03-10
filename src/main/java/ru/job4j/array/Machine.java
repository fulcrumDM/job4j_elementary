package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;

        int back = money - price;

        for (int i = 0; i < coins.length; i++) {
            while (back - coins[i] >= 0) {
                    back = back - coins[i];
                    result[size++] = coins[i];
            }
        }

        return Arrays.copyOf(result, size);
    }
}
