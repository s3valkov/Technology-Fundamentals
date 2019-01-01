package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P11_IronGirder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> townTime = new HashMap<>();
        HashMap<String, Integer> passengerCount = new HashMap<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Slide rule")) {
                break;
            }

            String[] info = input.split(":");
            String[] moreInfo = info[1].split("->");

            String town = info[0];
            int time = 0;
            int passenger = Integer.parseInt(moreInfo[1]);

            if (!moreInfo[0].equals("ambush")) {
                time = Integer.parseInt(moreInfo[0]);
            } else if (townTime.containsKey(town)) {
                time = 0;
                townTime.put(town, time);
                passengerCount.put(town, passengerCount.get(town) - passenger);
                continue;
            } else {
                continue;
            }

            if (!townTime.containsKey(town) && !passengerCount.containsKey(town)) {
                townTime.put(town, time);
                passengerCount.put(town, passenger);
            } else {

                if (time < townTime.get(town) || townTime.get(town) == 0) {
                    townTime.put(town, time);
                }

                passengerCount.put(town, passengerCount.get(town) + passenger);
            }

        }

        townTime.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .thenComparing(Map.Entry.<String, Integer>comparingByKey()))
                .forEach(e -> {

                    if (e.getValue() != 0 && passengerCount.get(e.getKey()) > 0) {
                        System.out.printf("%s -> Time: %d -> Passengers: %d\n"
                                , e.getKey()
                                , e.getValue()
                                , passengerCount.get(e.getKey()));
                    }

                });


    }
}
