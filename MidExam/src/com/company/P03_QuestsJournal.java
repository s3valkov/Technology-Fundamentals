package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03_QuestsJournal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> course = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")));


        while (true) {
            String line = scanner.nextLine();

            if (line.equals("retire")) {
                break;
            }

            String[] tokens = line.split(" - ");
            String cmd = tokens[0];
            String addWord = tokens[1];

            switch (cmd) {
                case "Start":

                    if (!course.contains(addWord)) {
                        course.add(addWord);
                    }

                    break;
                case "complete":

                    if (course.contains(tokens[1])) {
                        course.remove(tokens[1]);
                    }

                    break;
                case "Side Quest":

                    if (course.contains(tokens[1]) && course.contains(tokens[2])) {
                        int index = course.indexOf(tokens[1]);
                        course.add(index + 1, tokens[2]);
                    }

                    break;
                case "Renew":

                    if (course.contains(tokens[1])) {
                        int index = course.indexOf(tokens[1]);
                        course.remove(index);
                        course.add(tokens[1]);
                    }

                    break;
            }
            line = scanner.nextLine();
        }

        for (String predmeti : course) {
            System.out.print(predmeti + ",");
        }


    }
}
