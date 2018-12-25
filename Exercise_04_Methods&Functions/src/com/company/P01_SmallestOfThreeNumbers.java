package com.company;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int[] numbers = new int[3];
        numbers[0] = Integer.parseInt(scanner.nextLine());
        numbers[1] = Integer.parseInt(scanner.nextLine());
        numbers[2] = Integer.parseInt(scanner.nextLine());
        System.out.println(returnMax(min, numbers));

    }

    static int returnMax(int min, int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
