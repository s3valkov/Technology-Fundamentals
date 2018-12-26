package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {

            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }

            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Add":
                    int addNumber = Integer.parseInt(tokens[1]);
                    numbers.add(addNumber);
                    break;
                case "Remove":
                    int removeNumber = Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(removeNumber));
                    break;
                case "RemoveAt":
                    int removePos = Integer.parseInt(tokens[1]);
                    numbers.remove(removePos);
                    break;
                case "Insert":
                    int number = Integer.parseInt(tokens[1]);
                    int position = Integer.parseInt(tokens[2]);

                    if (position >= 0) {
                        numbers.add(position, number);
                    }

                    break;
            }

        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
