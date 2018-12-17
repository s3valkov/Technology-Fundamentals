package com.company;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        String pass = scanner.nextLine();
        int count = 1;

        while (!pass.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            count++;
            pass = scanner.nextLine();

            if (count > 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }

        }

        if (pass.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }

    }

}




