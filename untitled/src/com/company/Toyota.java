package com.company;

public class Toyota extends Car {
    private String model;
    private int horsepower;


    public Toyota(String type, String serviceType, int numberOfSits, String transportMode, String model, int horsepower) {
        super(type, serviceType, numberOfSits, transportMode);
        this.model = model;
        this.horsepower = horsepower;
    }

    @Override
    public void carInfo() {
        System.out.println("This type of Car is called Toyota Corolla!");
        super.carInfo();
    }
}
