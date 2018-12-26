package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNum = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondNum = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxSize = Math.max(firstNum.size(), secondNum.size());

        for (int i = 0; i < maxSize; i++) {

            if (i < firstNum.size()) {
                System.out.print(firstNum.get(i) + " ");
            }

            if (i < secondNum.size()) {
                System.out.print(secondNum.get(i) + " ");
            }

        }
    }
}
