package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            String[] tokens = line.split("\\s+");

            if (tokens[0].equals("Delete")) {
                int numberToRemove = Integer.parseInt(tokens[1]);

                if (numbers.contains(numberToRemove)) {
                    numbers.removeIf(e -> e.equals(numberToRemove));
                }

            } else {
                int element = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);

                if (position >= 0 && position < numbers.size()) {
                    numbers.add(position, element);
                }

            }
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
