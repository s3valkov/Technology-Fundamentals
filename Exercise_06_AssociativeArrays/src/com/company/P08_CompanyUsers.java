package com.company;

import java.util.*;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, ArrayList<String>> companyUsers = new LinkedHashMap<>();

        while (true) {
            String cmd = scanner.nextLine();
            if (cmd.equals("End")) {
                break;
            }
            String[] tokens = cmd.split("\\s+->\\s+");
            String company = tokens[0];
            String idUser = tokens[1];

            if (!companyUsers.containsKey(company)) {
                companyUsers.put(company, new ArrayList<>());
                companyUsers.get(company).add(idUser);
            } else {
                if (!(companyUsers.get(company).contains(idUser)))
                    companyUsers.get(company).add(idUser);
            }
        }

        companyUsers.entrySet().stream()
                .sorted(Map.Entry.<String, ArrayList<String>>comparingByKey())
                .forEach(company -> {
                            System.out.println(company.getKey());
                            System.out.print("-- ");
                            System.out.println(String.join("\n-- ", company.getValue()));
                        }
                );


    }
}
