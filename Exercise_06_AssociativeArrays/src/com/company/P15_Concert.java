package com.company;

import java.util.*;

public class P15_Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<String>> concertInfo = new LinkedHashMap<>();
        HashMap<String, Integer> concertTime = new LinkedHashMap<>();
        int countTime = 0;
        while (true) {

            String cmd = scanner.nextLine();

            if (cmd.equals("start of concert")) {
                break;
            }

            String[] bandInfo = cmd.split(";");
            String bandName = "";

            if (bandInfo[0].equals("Add")) {
                bandName = bandInfo[1].trim();

                if (!concertInfo.containsKey(bandName)) {
                    concertInfo.put(bandName, new ArrayList<>());
                }

                String[] members = bandInfo[2].split(",\\s+");

                for (int i = 0; i < members.length; i++) {

                    if (!concertInfo.get(bandName).contains(members[i].trim())) {
                        concertInfo.get(bandName).add(members[i].trim());
                    }

                }
            } else {
                int time = Integer.parseInt(bandInfo[2].trim());
                countTime += time;
                String band = bandInfo[1];

                if (!concertInfo.containsKey(band)) {
                    concertInfo.put(band, new ArrayList<>());
                }

                if (!concertTime.containsKey(band)) {
                    concertTime.put(band, time);
                } else {
                    concertTime.put(band, concertTime.get(band) + time);
                }

            }
        }

        String band = scanner.nextLine();
        System.out.println("Total time: " + countTime);
        concertTime.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> {
                    System.out.printf("%s -> %d\n", e.getKey().trim(), e.getValue());
                });

        System.out.println(band);
        System.out.print("=> ");
        System.out.println(String.join("\n=> ", concertInfo.get(band)).trim());
    }

}
