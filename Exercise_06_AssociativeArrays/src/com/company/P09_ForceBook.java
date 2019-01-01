package com.company;

import java.util.*;

public class P09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, ArrayList<String>> forceUsers = new HashMap<>();

        while (true) {
            String data = scanner.nextLine();

            if (data.equals("Lumpawaroo")) {
                break;
            }

            String side;
            String user;

            if (data.contains(" | ")) {
                String[] tokens = data.trim().split(" \\| ");
                side = tokens[0];
                user = tokens[1];

                if (!forceUsers.containsKey(side)) {
                    forceUsers.put(side, new ArrayList<>());
                }

                boolean flag = true;

                for (Map.Entry<String, ArrayList<String>> entry : forceUsers.entrySet()) {

                    if (entry.getValue().contains(user)) {
                        flag = false;
                        break;
                    }

                }

                if (flag) {
                    forceUsers.get(side).add(user);
                }

            } else if (data.contains(" -> ")) {
                String[] tokens = data.split(" -> ");
                side = tokens[1];
                user = tokens[0];

                if (!forceUsers.containsKey(side)) {
                    forceUsers.put(side, new ArrayList<>());
                    forceUsers.get(side).add(user);
                } else {

                    for (Map.Entry<String, ArrayList<String>> entry : forceUsers.entrySet()) {

                        if (entry.getValue().contains(user)) {
                            entry.getValue().remove(user);
                            break;
                        }

                    }

                    forceUsers.get(side).add(user);
                }

                System.out.printf("%s joins the %s side!\n", user, side);
            }
        }


        forceUsers.entrySet().
                stream().
                sorted((n1, n2) ->
                {
                    int res = Integer.compare(n2.getValue().size(), n1.getValue().size());
                    if (res == 0) {
                        res = n1.getKey().compareTo(n2.getKey());
                    }
                    return res;
                })
                .forEach(e ->
                {
                    if (e.getValue().size() > 0) {
                        Collections.sort(e.getValue());
                        System.out.printf("Side: %s, Members: %d\n", e.getKey(), e.getValue().size());
                        e.getValue().forEach(n -> {
                            System.out.printf("! %s\n", n);
                        });
                    }

                });


    }
}
