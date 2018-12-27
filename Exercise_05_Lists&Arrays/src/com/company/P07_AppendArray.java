package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_AppendArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> number = Arrays.stream(scanner.nextLine().split("\\|+"))
                .map(String::trim).collect(Collectors.toList());
        Collections.reverse(number);

        String toPrint = number.toString().replaceAll("[\\]\\[,]", "").trim();
        toPrint = toPrint.replaceAll("\\s+", " ");

        System.out.println(toPrint);


    }
}
