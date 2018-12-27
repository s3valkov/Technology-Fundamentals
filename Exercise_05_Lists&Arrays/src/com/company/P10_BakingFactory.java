package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P10_BakingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().toLowerCase();
        List<String> bestBatch = new ArrayList<>();

        int bestLength = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        double bestAverageSum = Integer.MIN_VALUE;

        while (!line.equals("bake it!")) {

            List<String> numbers = Arrays.asList(line.split("#+"));

            if (line.equals("")){
                continue;
            }

            int sum = 0;
            double averageSum = 0;
            int length = 0;

            for (int i = 0; i < numbers.size(); i++) {
                sum += Integer.parseInt(numbers.get(i));
            }
            length = numbers.size();


            averageSum = sum / numbers.size();

            if (sum > maxSum) {
                maxSum = sum;
                bestBatch = numbers;
                bestAverageSum = averageSum;
                bestLength = length;
            } else if (sum == maxSum) {

                if (averageSum > bestAverageSum) {
                    bestAverageSum = averageSum;
                    bestLength = length;
                    bestBatch = numbers;
                } else if (length < bestLength) {
                    bestLength = length;
                    bestBatch = numbers;
                }

            }


            line = scanner.nextLine().toLowerCase();
        }

        System.out.println("Best Batch quality: " + maxSum);

        for (String num : bestBatch) {
            System.out.print(num + " ");
        }
    }
}



