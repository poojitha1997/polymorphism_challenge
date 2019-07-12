package main.java.com.stackroute.challenge;

import java.util.Scanner;

//main method
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + ": " + car.getName() + "\n"
                    + "Cylinders: " + car.getCylinders() + "\n");
            car.startEngine();
            car.accelerate();
            car.brake();
            System.out.println("\n");
        }

    }

    public static Car randomCar() {
        //using scanner class
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                return new Benz("Mercedes", 0);
            case 2:
                return new Audi("Audi A4", 6);
            case 3:
                return new Porsche("porsche 911", 6);
        }
        return null;
    }
}
