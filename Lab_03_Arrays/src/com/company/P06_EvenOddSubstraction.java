package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EvenOddSubstraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] intArray = Arrays.stream(input).mapToInt(i -> Integer.parseInt(i)).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i <= intArray.length - 1; i++) {

            if (intArray[i] % 2 == 0) {
                evenSum += intArray[i];
            } else {
                oddSum += intArray[i];
            }

        }

        System.out.println(evenSum - oddSum);
    }
}
