package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P10_ExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> studentResults = new HashMap<>();
        HashMap<String, Integer> counts = new HashMap<>();
        int score = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("exam finished")) {
                break;
            }

            String[] info = input.split("-");
            String name = info[0];
            String submission = info[1];

            if (info.length > 2) {
                score = Integer.parseInt(info[2]);
            }


            if (!studentResults.containsKey(name) && info.length > 2) {
                studentResults.put(name, score);
            } else {

                if (studentResults.get(name) < score) {
                    studentResults.put(name, score);
                }

            }

            if (!counts.containsKey(submission) && info.length > 2) {
                counts.put(submission, 1);
            } else if (info.length > 2) {
                counts.put(submission, counts.get(submission) + 1);
            }

            if (submission.equals("banned")) {
                studentResults.remove(name);
            }
        }

        System.out.println("Results:");

        studentResults.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.<String, Integer>comparingByKey()))
                .forEach(e -> {
                    System.out.printf("%s | %d\n", e.getKey(), e.getValue());
                });

        System.out.println("Submissions:");

        counts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.<String, Integer>comparingByKey()))
                .forEach(e -> {
                    System.out.printf("%s - %d\n", e.getKey(), e.getValue());
                });


    }
}
