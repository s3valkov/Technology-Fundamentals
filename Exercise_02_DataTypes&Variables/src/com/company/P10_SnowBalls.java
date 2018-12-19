package com.company;

import java.util.Scanner;

public class P10_SnowBalls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balls = Integer.parseInt(scanner.nextLine());

        double value = 0, result = 0;
        double max = Double.MIN_VALUE;
        int maxS = 0, maxT = 0, maxQ = 0;

        for (int i = balls; i > 0; i--) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            value = (snow / time);
            result = Math.pow((value), (double) quality);

            if (result >= max) {
                max = result;
                maxS = snow;
                maxT = time;
                maxQ = quality;
            }

            System.out.printf("%d : %d = %.0f (%d)",
                    maxS,
                    maxT,
                    max,
                    maxQ);
        }
    }
}
