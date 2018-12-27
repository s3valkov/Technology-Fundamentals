package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            if (tokens[2].equals("going!")) {

                if (!names.contains(tokens[0])) {
                    names.add(tokens[0]);
                } else {
                    System.out.printf("%s is already in the list!\n", tokens[0]);
                }

            } else {

                if (names.contains(tokens[0])) {
                    names.remove(tokens[0]);
                } else {
                    System.out.printf("%s is not in the list!\n", tokens[0]);
                }

            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
