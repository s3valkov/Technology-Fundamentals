package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P08_CondenseArrayNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.
                stream(scanner.nextLine().split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();

        int[] condense = new int[numbers.length - 1];

        if (numbers.length == 1) {
            System.out.println(numbers[0]);
            return;
        }

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < condense.length - i; j++) {
                condense[j] = numbers[j] + numbers[j + 1];
            }

            numbers = condense;
        }
        
        System.out.println(condense[0]);
    }
}
