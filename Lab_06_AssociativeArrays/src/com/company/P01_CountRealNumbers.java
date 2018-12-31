package com.company;

import java.text.DecimalFormat;
import java.util.*;

public class P01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> counter = new TreeMap<>();

        for (double number : nums) {

            if (!counter.containsKey(number)) {
                counter.put(number, 0);
            }

            counter.put(number, counter.get(number) + 1);
        }

        for (Map.Entry<Double, Integer> entry : counter.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#############");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()),entry.getValue());
        }
    }
}
