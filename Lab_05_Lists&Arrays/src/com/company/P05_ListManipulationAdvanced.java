package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            String[] tokens = line.toString().split(" ");

            if (tokens[0].equals("Print")) {
                tokens[0] += tokens[1];
            }

            switch (tokens[0]) {
                case "Contains":
                    int element = Integer.parseInt(tokens[1]);

                    if (numbers.contains(element)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }

                    break;
                case "Printeven":

                    for (int i = 0; i < numbers.size(); i++) {

                        if (numbers.get(i) % 2 == 0) {
                            System.out.print(numbers.get(i) + " ");
                        }

                    }

                    System.out.println();
                    break;
                case "Printodd":

                    for (int i = 0; i < numbers.size(); i++) {

                        if (numbers.get(i) % 2 == 1) {
                            System.out.print(numbers.get(i) + " ");
                        }

                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;

                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }

                    System.out.println(sum);
                    break;
                case "Filter":
                    int filtNumber = Integer.parseInt(tokens[2]);

                    if (tokens[1].equals("<")) {

                        for (int i = 0; i < numbers.size(); i++) {

                            if (numbers.get(i) < filtNumber) {
                                System.out.print(numbers.get(i) + " ");
                            }

                        }
                        System.out.println();

                    } else if (tokens[1].equals("<=")) {

                        for (int i = 0; i < numbers.size(); i++) {

                            if (numbers.get(i) <= filtNumber) {
                                System.out.print(numbers.get(i) + " ");
                            }

                        }

                        System.out.println();

                    } else if (tokens[1].equals(">")) {

                        for (int i = 0; i < numbers.size(); i++) {

                            if (numbers.get(i) > filtNumber) {
                                System.out.print(numbers.get(i) + " ");

                            }
                        }

                        System.out.println();

                    } else if (tokens[1].equals(">=")) {

                        for (int i = 0; i < numbers.size(); i++) {

                            if (numbers.get(i) >= filtNumber) {
                                System.out.print(numbers.get(i) + " ");
                            }

                        }

                        System.out.println();
                        break;
                    }
            }
        }
    }
}




