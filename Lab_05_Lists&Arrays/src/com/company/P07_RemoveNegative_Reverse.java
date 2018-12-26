package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_RemoveNegative_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < 0) {
                numbers.remove(i);
                i = -1;
            }

        }
        int size = numbers.size();

        if (size == 0) {
            System.out.println("empty");

        } else {

            for (int i = 0; i < numbers.size() / 2; i++) {
                int a = numbers.get(i);
                int b = numbers.get(size - 1);

                numbers.set(size - 1, a);
                numbers.set(i, b);
                size--;
                a = 0;
                b = 0;
            }

        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}
