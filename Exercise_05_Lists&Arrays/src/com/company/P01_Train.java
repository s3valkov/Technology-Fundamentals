package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> vagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());


        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            String[] tokens = line.split(" ");

            if (tokens[0].equals("Add")) {
                int newVagon = Integer.parseInt(tokens[1]);
                vagons.add(newVagon);
            } else {
                int people = Integer.parseInt(tokens[0]);

                for (int i = 0; i < vagons.size(); i++) {

                    if (maxCapacity >= vagons.get(i) + people) {
                        vagons.set(i, vagons.get(i) + people);
                        break;
                    }

                }
            }

        }

        for (int people : vagons) {
            System.out.print(people + " ");
        }
    }
}
