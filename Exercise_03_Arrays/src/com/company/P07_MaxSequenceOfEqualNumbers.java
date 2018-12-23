package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int count = 0;
        int max = 0;
        int start = 0;

        for (int i = 0; i < intArray.length - 1; i++) {

            if (intArray[0] == intArray[i + 1]) {
                count++;

                if (count > max) {
                    start = i - count;
                    max = count;
                }

            } else {
                count = 0;
            }
        }

        for (int i = start + 1; i <= start + max + 1; i++) {
            System.out.print(intArray[i] + " ");
        }

    }
}
