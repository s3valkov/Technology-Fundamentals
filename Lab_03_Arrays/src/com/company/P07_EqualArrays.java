package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P07_EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.
                stream(scanner.nextLine().split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();

        int[] secondArray = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();

        int sum = 0;
        int index = -1;

        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] == secondArray[i]) {
                sum += firstArray[i];
            } else {
                index = i;
                break;
            }

        }

        if (index == -1) {
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.println("Arrays are not identical. Found difference at " + index + " index.");
        }

    }
}
