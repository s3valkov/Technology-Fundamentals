package P06_Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Vehicle> cars = new ArrayList<>();
        ArrayList<Vehicle> trucks = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("End")) {
                break;
            }

            String[] data = line.split("\\s+");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);

            if (vehicle.getType().equals("Car")) {
                cars.add(vehicle);
            } else {
                trucks.add(vehicle);
            }

        }


        while (true) {
            String cmd = scanner.nextLine();
            if (cmd.equals("Close the Catalogue")) {
                break;
            }
            for (Vehicle car : cars) {
                if (car.getModel().equals(cmd)) {
                    System.out.println(car.toString());
                }
            }

            for (Vehicle truck : trucks) {
                if (truck.getModel().equals(cmd)) {
                    System.out.println(truck.toString());
                }
            }
        }


        double carHpSum = 0;
        double truckHpSum = 0;
        double carHpAverage = 0;
        double truckHpAverage = 0;

        if (!cars.isEmpty()) {

            for (Vehicle car : cars) {
                carHpSum += car.getHorsePower();
            }

            carHpAverage = carHpSum / cars.size();
        }

        System.out.println(String.format("Cars have average horsepower of: %.2f.", carHpAverage));

        if (!trucks.isEmpty()) {

            for (Vehicle truck : trucks) {
                truckHpSum += truck.getHorsePower();
            }

            truckHpAverage = truckHpSum / trucks.size();
        }

        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckHpAverage));

    }
}

