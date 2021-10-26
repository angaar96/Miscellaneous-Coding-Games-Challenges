package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Assumption is made that compact spots are different to regular spots and should be defined separately. They can only house motorcycles.

        ParkingLot myParkingLot = new ParkingLot(60, 0, 60, 20, 10, 0, 10);
        System.out.println("Total number of spots: " + myParkingLot.getTotalNumberOfSpots());
        System.out.println("Number of regular spots currently taken: " + myParkingLot.getNumberOfTakenSpots());
        System.out.println("Number of free car spots: " + myParkingLot.getNumberOfFreeSingleSpots());
        System.out.println("Number of free Van spots: " + myParkingLot.getNumberOfFreeVanSpots());
        System.out.println("Number of free motorcycle spots: " +  (myParkingLot.getNumberOfFreeSingleSpots() + myParkingLot.getNumberOfFreeCompactSpots()));
        System.out.println("");
        Vehicle Car1 = new Vehicle (1, "Car");
        Vehicle Motorcycle1 = new Vehicle(1, "Motorcycle");
        Vehicle Van1 = new Vehicle(3, "Van");
        Vehicle Car2 = new Vehicle (1, "Car");
        Vehicle Motorcycle2 = new Vehicle(1, "Motorcycle");
        Vehicle Van2 = new Vehicle(3, "Van");
        Vehicle Car3 = new Vehicle (1, "Car");
        Vehicle Motorcycle3 = new Vehicle(1, "Motorcycle");
        Vehicle Van3 = new Vehicle(3, "Van");
        Vehicle Car4 = new Vehicle (1, "Car");
        Vehicle Motorcycle4 = new Vehicle(1, "Motorcycle");
        Vehicle Van4 = new Vehicle(3, "Van");
        Vehicle Car5 = new Vehicle (1, "Car");
        Vehicle Motorcycle5 = new Vehicle(1, "Motorcycle");
        Vehicle Van5 = new Vehicle(3, "Van");
        myParkingLot.parkVehicle(Van1);
        myParkingLot.parkVehicle(Van2);
        myParkingLot.parkVehicle(Van3);
        myParkingLot.parkVehicle(Van4);
        myParkingLot.parkVehicle(Van5);
        myParkingLot.parkVehicle(Car1);
        myParkingLot.parkVehicle(Motorcycle1);
    }
    }

/*
Design a parking lot using object-oriented principles

Goals:
- Your solution should be in Java - if you would like to use another language, please let the interviewer know.
- Boilerplate is provided. Feel free to change the code as you see fit

Assumptions:
- The parking lot can hold motorcycles, cars and vans
- The parking lot has motorcycle spots, car spots and large spots
- A motorcycle can park in any spot
- A car can park in a single compact spot, or a regular spot
- A van can park, but it will take up 3 regular spots
- These are just a few assumptions. Feel free to ask your interviewer about more assumptions as needed

Here are a few methods that you should be able to run:
- Tell us how many spots are remaining
- Tell us how many total spots are in the parking lot
- Tell us when the parking lot is full
- Tell us when the parking lot is empty
- Tell us when certain spots are full e.g. when all motorcycle spots are taken
- Tell us how many spots vans are taking up

Hey candidate! Welcome to your interview. I'll start off by giving you a Solution class. To run the code at any time, please hit the run button located in the top left corner.
*/
