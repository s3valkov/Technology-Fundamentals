package com.company;

import java.util.*;

public class P9_SoftUniCoursePlannig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> input = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")));

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("Retire!")) {
                break;
            }

            String[] tokens = line.split(" - ");
            String cmd = tokens[0];
            String lesson = tokens[1];

            switch (cmd) {
                case "Start":
                    if (!input.contains(tokens[1])) {
                        input.add(tokens[1]);
                    }
                    break;
                case "Complete":
                    if (input.contains(lesson)) {
                        input.remove(lesson);
                    }
                    break;
                case "Side Quest":
                    String[] dve = tokens[1].split(":");

                    if (input.contains(dve[0]) && !input.contains(dve[1])) {
                        int index = input.indexOf(dve[0]);
                        input.add(index + 1, dve[1]);
                    }

                    break;
                case "Renew":

                    if (input.contains(tokens[1])) {
                        int index = input.indexOf(tokens[1]);
                        input.remove(index);
                        input.add(tokens[1]);
                    }

                    break;
            }
        }

        for (int i = 0; i < input.size(); i++) {

            if (i == input.size() - 1) {
                System.out.print(input.get(i));
            } else {
                System.out.print(input.get(i) + ", ");
            }

        }
    }
}
