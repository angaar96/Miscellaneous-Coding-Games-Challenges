package com.company;

public class Vehicle {
    protected int numberOfSpotsTaken;
    protected String vehicleType;

    public Vehicle(int numberOfSpotsTaken, String vehicleType) {
        this.numberOfSpotsTaken = numberOfSpotsTaken;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getNumberOfSpots() {
        return numberOfSpotsTaken;
    }

    public void setNumberOfSpots(int numberOfSpotsTaken) {
        this.numberOfSpotsTaken = numberOfSpotsTaken;
    }
}
