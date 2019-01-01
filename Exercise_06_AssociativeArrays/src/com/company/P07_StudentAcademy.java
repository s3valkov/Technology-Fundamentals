package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P07_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        HashMap<String, Double> studentResult = new LinkedHashMap<>();
        HashMap<String, Integer> counts = new LinkedHashMap<>();

        while (n != 0) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentResult.containsKey(name) && !counts.containsKey(name)) {
                studentResult.put(name, grade);
                counts.put(name, 1);
            } else {
                studentResult.put(name, studentResult.get(name) + grade);
                counts.put(name, counts.get(name) + 1);
            }

            n--;
        }

        counts.entrySet().stream()
                .forEach(entry -> {
            studentResult.entrySet().stream()
                    .forEach(student -> {
                int counter = entry.getValue();
                if (entry.getKey().equals(student.getKey())) {
                    studentResult.put(student.getKey(), student.getValue() / counter);
                }
            });
        });

        studentResult.entrySet().stream()
                .sorted((a, b) -> {
            return b.getValue().compareTo(a.getValue());
        }).forEach(st -> {
            if (st.getValue() >= 4.5) {
                System.out.printf("%s -> %.2f%n", st.getKey(), st.getValue());
            }
        });


    }
}
