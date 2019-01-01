package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P12_MeTube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> views = new LinkedHashMap<>();
        HashMap<String, Integer> likes = new LinkedHashMap<>();

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("stats time")) {
                break;
            }

            String video = "";
            String cmd = "";
            int counts = 0;


            if (input.contains("-")) {
                String[] data = input.split("-");
                video = data[0];
                counts = Integer.parseInt(data[1]);

                if (!views.containsKey(video)) {
                    views.put(video, counts);
                    likes.putIfAbsent(video, 0);
                } else {
                    views.put(video, views.get(video) + counts);
                }

            } else {
                String[] data = input.split(":");
                cmd = data[0];
                video = data[1];
                if (cmd.equals("like")) {
                    likes.putIfAbsent(video, 0);
                    likes.put(video, likes.get(video) + 1);
                } else {
                    likes.putIfAbsent(video, 0);
                    likes.put(video, likes.get(video) - 1);
                }
            }
        }
        String cmd = scanner.nextLine();

        if (cmd.equals("by views")) {
            views.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue()
                            .reversed())
                    .forEach(e -> {
                        System.out.printf("%s - %d views - %d likes\n"
                                , e.getKey()
                                , e.getValue()
                                , likes.get(e.getKey()));
                    });


        } else {
            likes.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue()
                            .reversed())
                    .forEach(e -> {
                        System.out.printf("%s - %d views - %d likes\n"
                                , e.getKey()
                                , views.get(e.getKey())
                                , e.getValue());
                    });


        }


    }
}
