package com.company;

import java.util.*;

public class P06_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, ArrayList<String>> coursInformation = new LinkedHashMap<>();

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            String[] tokens = line.split("\\s+:\\s+");
            String cours = tokens[0];
            String name = tokens[1];

            if (!coursInformation.containsKey(cours)) {
                coursInformation.put(cours, new ArrayList<>());
            }

            coursInformation.get(cours).add(name);

        }

        coursInformation.entrySet().stream()
                .sorted((a, b) -> {
                    return b.getValue().size() - a.getValue().size();
                }).forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            ArrayList<String> names = entry.getValue();

            names.sort((a, b) -> a.compareTo(b));

            for (String name : names) {
                System.out.println("-- " + name);
            }
        });

    }
}
