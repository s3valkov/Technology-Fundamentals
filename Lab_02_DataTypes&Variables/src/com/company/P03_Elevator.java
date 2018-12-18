package com.company;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = 0;

        if (people % capacity == 0) {
            courses = people / capacity;
        } else if (people <= capacity) {
            courses = 1;
        } else {
            courses = people / capacity + 1;
        }

        System.out.println(courses);
    }
}
