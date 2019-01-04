package com.company;

import java.util.Scanner;


public class P12_SongEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String cmd = scanner.nextLine();

            if (cmd.equals("End") || cmd.equals("end")) {
                break;
            }

            String[] songInfo = cmd.split(":");
            String name = songInfo[0];
            String regex = "(^[A-Z]{1}[a-z\\s\\']*$)";
            String songRegex = "(^[A-Z+\\s]+$)";


            if (name.matches(regex) && songInfo[1].matches(songRegex)) {

                int count = name.length();
                count %= 26;
                String encrypted = name + ":" + songInfo[1];
                StringBuilder sb = new StringBuilder();

                for (char symbol : encrypted.toCharArray()) {
                    int value = symbol + count;

                    if ((value >= 65 && value <= 90 && symbol >= 65 && symbol <= 90) ||
                            (value >= 97 && value <= 122 && symbol >= 97 && symbol <= 122)) {

                        if (!(symbol == ' ' || symbol == '\'' || symbol == ':')) {

                            sb.append((char) value);
                        } else if (symbol == ':') {
                            symbol = '@';
                            sb.append(symbol);
                        } else {
                            sb.append(symbol);
                        }

                    } else if (symbol == ':') {
                        sb.append('@');
                    } else if (symbol == ' ' || symbol == '\'') {
                        sb.append(symbol);
                    } else {
                        value = (value - 26);
                        sb.append((char) value);
                    }
                }

                System.out.println("Successful encryption: " + sb);

            } else {
                System.out.println("Invalid input!");
            }
        }

    }
}
