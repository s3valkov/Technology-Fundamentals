package com.company;

import java.util.*;

public class P13_Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, ArrayList<String>> words = new TreeMap<>();

        String[] wordDefinition = scanner.nextLine().split(" \\| ");
        String[] toShow = scanner.nextLine().split(" \\| ");
        String cmd = scanner.nextLine();

        for (int i = 0; i < wordDefinition.length; i++) {
            String[] info = wordDefinition[i].split(": ");
            String word = info[0];
            String description = info[1];

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(description);
        }

        Map<String, ArrayList<String>> forPrint = new LinkedHashMap<>();

        for (String s : toShow) {

            if (words.containsKey(s)) {
                forPrint.put(s, words.get(s));
            }

        }

        forPrint.forEach((k, v) ->
                v.sort((l1, l2) -> Integer.compare(l2.length(), l1.length())));
        forPrint.forEach((k, v) -> {
            System.out.println(k);

            for (String s : v) {
                System.out.println("-" + s);
            }

        });


        if (cmd.equals("List")) {
            words.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> {
                System.out.print(e.getKey() + " ");
            });
        }

    }
}
