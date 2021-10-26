package com.company;

public class ParkingLot {
    private int totalNumberOfSpots;
    private int numberOfTakenSpots;
    private int numberOfFreeSingleSpots;
    private int numberOfFreeVanSpots;
    private int totalNumberOfCompactSpots;
    private int numberOfTakenCompactSpots;
    private int numberOfFreeCompactSpots;

    public ParkingLot (int totalNumberOfSpots,
                       int numberOfTakenSpots,
                       int numberOfFreeSingleSpots,
                       int numberOfFreeVanSpots,
                       int totalNumberOfCompactSpots,
                       int numberOfTakenCompactSpots,
                       int numberOfFreeCompactSpots
    ) {
        this.totalNumberOfSpots = totalNumberOfSpots;
        this.numberOfTakenSpots = numberOfTakenSpots;
        this.numberOfFreeSingleSpots = numberOfFreeSingleSpots;
        this.numberOfFreeVanSpots = numberOfFreeVanSpots;
        this.totalNumberOfCompactSpots = totalNumberOfCompactSpots;
        this.numberOfTakenCompactSpots = numberOfTakenCompactSpots;
        this.numberOfFreeCompactSpots = numberOfFreeCompactSpots;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (this.numberOfFreeSingleSpots == totalNumberOfSpots) {
            System.out.println("You are in luck! The parking lot is empty today.");
        }
        switch (vehicle.getVehicleType()) {
            case "Van":
                if (this.numberOfFreeSingleSpots > 2) {
                    this.numberOfTakenSpots += 3;
                    this.numberOfFreeVanSpots -= 1;
                    this.numberOfFreeSingleSpots -= 3;
                    System.out.println("The " + vehicle.getVehicleType() + " has been successfully parked");
                    System.out.println("Number of free car spots: " +  this.getNumberOfFreeSingleSpots());
                    System.out.println("Number of free Van spots: " +  this.getNumberOfFreeVanSpots());
                    System.out.println("Number of free motorcycle spots: " +  (this.getNumberOfFreeSingleSpots() + this.getNumberOfFreeCompactSpots()));
                    System.out.println("Number of free Van spots: " +  this.getTotalNumberOfSpots());
                    System.out.println("");
                } else {
                    System.out.println("There are not enough free spots to park your " + vehicle.getVehicleType() + ". Please wait for some vehicles to leave.");
                    System.out.println("");
                }
                break;
            case "Car":
                if (this.numberOfFreeSingleSpots > 0) {
                    this.numberOfTakenSpots += 1;
                    this.numberOfFreeVanSpots = (int) Math.floor(numberOfFreeSingleSpots / 3);
                    this.numberOfFreeSingleSpots -= 1;
                    System.out.println("The " + vehicle.getVehicleType() + " has been successfully parked");
                    System.out.println("Number of free car spots: " +  this.getNumberOfFreeSingleSpots());
                    System.out.println("Number of free Van spots: " +  this.getNumberOfFreeVanSpots());
                    System.out.println("Number of free motorcycle spots: " +  (this.getNumberOfFreeSingleSpots() + this.getNumberOfFreeCompactSpots()));
                    System.out.println("Number of free Van spots: " +  this.getNumberOfFreeVanSpots());
                    System.out.println("");
                } else {
                    System.out.println("There is no spot available to park your " + vehicle.getVehicleType() + ". Please wait for a vehicle to leave.");
                    System.out.println("");
                }
                break;
            case "Motorcycle":
                if (this.numberOfFreeCompactSpots > 0) {
                    System.out.println("There is a compact spot available. Your motorcycle will be parked there.");
                    this.numberOfFreeCompactSpots -= 1;
                    this.numberOfTakenCompactSpots += 1;
                    System.out.println("Number of free car spots: " +  this.getNumberOfFreeSingleSpots());
                    System.out.println("Number of free Van spots: " +  this.getNumberOfFreeVanSpots());
                    System.out.println("Number of free motorcycle spots: " +  (this.getNumberOfFreeSingleSpots() + this.getNumberOfFreeCompactSpots()));
                    System.out.println("Number of free Van spots: " +  this.getNumberOfFreeVanSpots());
                    System.out.println("");
                } else if (this.numberOfFreeSingleSpots > 0) {
                    System.out.println("There are unfortunately no compact spots available. However, you may park your motorcycle in a regular spot.");
                    this.numberOfFreeSingleSpots -= 1;
                    this.numberOfTakenSpots += 1;
                    this.numberOfFreeVanSpots = (int) Math.floor(numberOfFreeSingleSpots / 3);
                    System.out.println("Number of free car spots: " +  this.getNumberOfFreeSingleSpots());
                    System.out.println("Number of free Van spots: " +  this.getNumberOfFreeVanSpots());
                    System.out.println("Number of free motorcycle spots: " +  (this.getNumberOfFreeSingleSpots() + this.getNumberOfFreeCompactSpots()));
                    System.out.println("Number of free Van spots: " +  this.getNumberOfFreeVanSpots());
                    System.out.println("");
                } else {
                    System.out.println("Oh no! There are no compact or single spots available to park your " + vehicle.getVehicleType() + ". You will have to wait for a vehicle to leave.");
                    System.out.println("");
                }
        }
    }

    public int getTotalNumberOfSpots() {
        return totalNumberOfSpots;
    }

    public void setTotalNumberOfSpots(int totalNumberOfSpots) {
        this.totalNumberOfSpots = totalNumberOfSpots;
    }

    public int getNumberOfTakenSpots() {
        return numberOfTakenSpots;
    }

    public void setNumberOfTakenSpots(int numberOfTakenSpots) {
        this.numberOfTakenSpots = numberOfTakenSpots;
    }

    public int getNumberOfFreeSingleSpots() {
        return numberOfFreeSingleSpots;
    }

    public void setNumberOfFreeSingleSpots(int numberOfFreeSingleSpots) {
        this.numberOfFreeSingleSpots = numberOfFreeSingleSpots;
    }

    public int getNumberOfFreeVanSpots() {
        return numberOfFreeVanSpots;
    }

    public void setNumberOfFreeVanSpots(int numberOfFreeVanSpots) {
        this.numberOfFreeVanSpots = numberOfFreeVanSpots;
    }

    public int getTotalNumberOfCompactSpots() {
        return totalNumberOfCompactSpots;
    }

    public void setTotalNumberOfCompactSpots(int totalNumberOfCompactSpots) {
        this.totalNumberOfCompactSpots = totalNumberOfCompactSpots;
    }

    public int getNumberOfTakenCompactSpots() {
        return numberOfTakenCompactSpots;
    }

    public void setNumberOfTakenCompactSpots(int numberOfTakenCompactSpots) {
        this.numberOfTakenCompactSpots = numberOfTakenCompactSpots;
    }

    public int getNumberOfFreeCompactSpots() {
        return numberOfFreeCompactSpots;
    }

    public void setNumberOfFreeCompactSpots(int numberOfFreeCompactSpots) {
        this.numberOfFreeCompactSpots = numberOfFreeCompactSpots;
    }
}
