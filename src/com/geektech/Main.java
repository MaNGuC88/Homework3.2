package com.geektech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {15, 96, -54, 8, 72, 163, -4, 478};
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int min_i = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = numbers[i];
                numbers[i] = numbers[min_i];
                numbers[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
