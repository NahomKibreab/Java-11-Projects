package com.company;

public class Vehicle {
    private String type;
    private int moving;
    private int steering;
    private boolean gears;

    public Vehicle(String type, int moving, int steering, boolean gears) {
        this.type = type;
        this.moving = moving;
        this.steering = steering;
        this.gears = gears;
    }

    public String getType() {
        System.out.println("Vehicle getType() called");
        System.out.println("Vehicle type is " + type);
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
