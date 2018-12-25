package com.company;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine().toLowerCase();

        if (passwordLength(password).equals("") && consistIntegers(password).equals("") && consistLettersAndDigits(password).equals("")) {
            System.out.println("Password is valid");
        } else if (consistLettersAndDigits(password).equals("") && !(passwordLength(password).equals("") && consistIntegers(password).equals(""))) {
            System.out.println(passwordLength(password));
            System.out.println(consistIntegers(password));
        } else {
            System.out.println(passwordLength(password));
            System.out.println(consistLettersAndDigits(password));
            System.out.println(consistIntegers(password));
        }

    }


    static String passwordLength(String password) {
        String result = "";

        if (password.length() > 5 && password.length() <= 10) {
        } else {
            result = "Password must be between 6 and 10 characters";
        }

        return result;

    }

    static String consistLettersAndDigits(String password) {
        char[] symbol = password.toLowerCase().toCharArray();
        int count = 0;
        String result = "";

        for (int i = 0; i < symbol.length; i++) {

            if (!((symbol[i] > 47 && symbol[i] < 58) || (symbol[i] > 96 && symbol[i] < 123))) {
                count++;
            }

        }

        if (count != 0) {
            result = "Password must consist only of letters and digits";
        }

        return result;
    }

    static String consistIntegers(String password) {
        char[] symbol = password.toLowerCase().toCharArray();
        String result = "";
        int count = 0;

        for (int i = 0; i < symbol.length; i++) {

            if (symbol[i] > 47 && symbol[i] < 58) {
                count++;
            }

        }

        if (count < 2) {
            result = "Password must have at least 2 digits";
        }

        return result;
    }
}

