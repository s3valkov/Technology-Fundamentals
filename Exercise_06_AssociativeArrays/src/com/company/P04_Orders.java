package com.company;

import java.util.*;

public class P04_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> quantity = new LinkedHashMap<>();
        Map<String, Double> orders = new LinkedHashMap<>();

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("buy")) {
                break;
            }

            String[] productsAndPrices = line.split("\\s+");
            String product = productsAndPrices[0];
            double price = Double.parseDouble(productsAndPrices[1]);
            int sum = Integer.parseInt(productsAndPrices[2]);

            if (!orders.containsKey(product) && !(quantity.containsKey(product))) {
                orders.put(product, price);
                quantity.put(product, sum);
            } else {
                orders.put(product, price);
                quantity.put(product, quantity.get(product) + sum);
            }

        }

        for (String product : orders.keySet()) {

            if (quantity.equals(product) == orders.equals(product)) {
                orders.put(product, orders.get(product) * quantity.get(product));
            }

        }

        orders.forEach((k, v) -> {
            System.out.println(String.format("%s -> %.2f", k, v));
        });

    }


}

