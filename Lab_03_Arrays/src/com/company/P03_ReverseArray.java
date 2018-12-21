package com.company;

import java.util.Scanner;

public class P03_ReverseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int array[] = new int[n];

        for (int i = 0; i < n ; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = array.length -1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
