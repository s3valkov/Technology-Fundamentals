package com.company;

import java.util.Scanner;

public class P09_Kamino {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int bestLength = 0;
        int bestIndex = 0;
        int bestSum = 0;
        int bestCounter = 0;
        int counter = 0;
        String bestDna = "";

        while (!line.equals("Clone them!")) {
            counter++;
            String sequence = line.replaceAll("!+", "");
            String[] dnas = sequence.split("0");

            int maxLength = 0;
            int sum = 0;
            String bestLocalDna = "";

            for (int i = 0; i < dnas.length; i++) {

                if (maxLength < dnas[i].length()) {
                    maxLength = dnas[i].length();
                    bestLocalDna = dnas[i];
                }

                sum += dnas[i].length();
            }

            int beginIndex = sequence.indexOf(bestLocalDna);

            if (maxLength > bestLength) {
                bestLength = maxLength;
                bestSum = sum;
                bestIndex = beginIndex;
                bestDna = sequence;
                bestCounter = counter;

            } else if (maxLength == bestLength && (beginIndex < bestIndex || sum > bestSum)) {
                bestLength = maxLength;
                bestSum = sum;
                bestIndex = beginIndex;
                bestDna = sequence;
                bestCounter = counter;

            } else if (counter == 1) {
                bestLength = maxLength;
                bestSum = sum;
                bestIndex = beginIndex;
                bestDna = sequence;
                bestCounter = counter;
            }

            line = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.\n", bestCounter, bestSum);

        for (int i = 0; i < bestDna.length(); i++) {
            System.out.print(bestDna.charAt(i) + " ");
        }
    }
}
