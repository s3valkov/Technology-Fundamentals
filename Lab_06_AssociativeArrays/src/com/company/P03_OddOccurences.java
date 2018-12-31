package com.company;

import java.util.*;

public class P03_OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordsInLowerCase = word.toLowerCase();

            if (!counts.containsKey(wordsInLowerCase)) {
                counts.put(wordsInLowerCase, 0);
            }

            counts.put(wordsInLowerCase, counts.get(wordsInLowerCase) + 1);
        }

        ArrayList<String> finalResult = new ArrayList<>();

        for (Map.Entry<String, Integer> word : counts.entrySet()) {

            if (word.getValue() % 2 == 1) {
                finalResult.add(word.getKey());
            }

        }

        for (int i = 0; i < finalResult.size(); i++) {
            System.out.print(finalResult.get(i));

            if (i < finalResult.size() - 1) {
                System.out.print(", ");
            }

        }


    }
}
