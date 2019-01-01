package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingList = new LinkedHashMap<>();

        while (n > 0) {

            String[] line = scanner.nextLine().split("\\s+");
            String cmd = line[0];
            String name = line[1];

            if (cmd.equals("register")) {
                String id = line[2];

                if (!parkingList.containsKey(name)) {
                    parkingList.put(name, id);
                    System.out.println(String
                            .format("%s registered %s successfully", name, id));
                } else {
                    System.out.println(String
                            .format("ERROR: already registered with plate number %s", id));
                }

            } else if (cmd.equals("unregister")) {

                if (parkingList.containsKey(name)) {
                    parkingList.remove(name);
                    System.out.println(String
                            .format("%s unregistered successfully", name));
                } else {
                    System.out.println(String
                            .format("ERROR: user %s not found", name));
                }

            }

            n--;
        }

        parkingList.forEach((k, v) -> {
            System.out.println(String
                    .format("%s => %s", k, v));
        });
    }
}
