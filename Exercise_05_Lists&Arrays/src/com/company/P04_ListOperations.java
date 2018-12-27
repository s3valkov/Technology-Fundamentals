package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {

            String line = scanner.nextLine();

            if (line.equals("End")) {
                break;
            }

            String[] cmd = line.split(" ");

            switch (cmd[0]) {
                case "Add":
                    int addNumber = Integer.parseInt(cmd[1]);
                    numbers.add(addNumber);
                    break;
                case "Remove":
                    int removeNumber = Integer.parseInt(cmd[1]);

                    if (removeNumber >= 0 && removeNumber < numbers.size()) {
                        numbers.remove(removeNumber);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Insert":
                    int number = Integer.parseInt(cmd[1]);
                    int position = Integer.parseInt(cmd[2]);

                    if (position >= 0 && position < numbers.size()) {
                        numbers.add(position, number);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Shift":
                    int movePosition = Integer.parseInt(cmd[2]);
                    movePosition %= numbers.size();

                    if (cmd[1].equals("left")) {

                        for (int i = 0; i < movePosition; i++) {
                            int firstNum = numbers.get(0);
                            numbers.add(firstNum);
                            numbers.remove(0);
                        }

                    } else {

                        for (int i = 0; i < movePosition; i++) {
                            int lastNumber = numbers.get(numbers.size() - 1);
                            numbers.add(0, lastNumber);
                            numbers.remove(numbers.size() - 1);
                        }

                    }
                    break;
            }
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


