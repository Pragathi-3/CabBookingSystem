package cabbookingsystem;

import java.util.*;

class Cab {
    String cabType;
    double pricePerKm;

    Cab(String cabType, double pricePerKm) {
        this.cabType = cabType;
        this.pricePerKm = pricePerKm;
    }

    public double calculateFare(double distance) {
        return distance * pricePerKm;
    }
}

public class CabBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Available cab types
        HashMap<Integer, Cab> cabs = new HashMap<>();
        cabs.put(1, new Cab("Mini", 12.0));
        cabs.put(2, new Cab("Sedan", 15.0));
        cabs.put(3, new Cab("SUV", 20.0));

        System.out.println("===== CAB BOOKING SYSTEM =====");
        System.out.println("Available Cabs:");
        System.out.println("1. Mini  (₹12/km)");
        System.out.println("2. Sedan (₹15/km)");
        System.out.println("3. SUV   (₹20/km)");
        System.out.println("--------------------------------");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Choose Cab Type (1/2/3): ");
        int cabChoice = sc.nextInt();

        if (!cabs.containsKey(cabChoice)) {
            System.out.println("Invalid cab choice! Try again.");
            return;
        }

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        Cab selectedCab = cabs.get(cabChoice);
        double totalFare = selectedCab.calculateFare(distance);

        // Display Booking Details
        System.out.println("\n===== BOOKING DETAILS =====");
        System.out.println("Passenger Name : " + name);
        System.out.println("Cab Type       : " + selectedCab.cabType);
        System.out.println("Distance       : " + distance + " km");
        System.out.println("Total Fare     : ₹" + totalFare);
        System.out.println("===============================");
        System.out.println("✅ Booking Confirmed! Have a safe ride.");
    }
}
