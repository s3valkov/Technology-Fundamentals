package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P02_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> countResource = new LinkedHashMap<>();

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("stop")) {
                break;
            }

            int number = Integer.parseInt(scanner.nextLine());

            if (!countResource.containsKey(text)) {
                countResource.put(text, number);
            } else {
                countResource.put(text, countResource.get(text) + number);
            }
        }

        for (String material : countResource.keySet()) {
            System.out.println(String.format("%s -> %d", material, countResource.get(material)));
        }
    }
}
