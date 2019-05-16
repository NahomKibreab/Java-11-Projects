package com.company;

public class Car extends Vehicle {

    private String serviceType;
    private int numberOfSits;
    private String transportMode;


    public Car(String type, String serviceType, int numberOfSits, String transportMode) {
        super(type, 1, 1, true);
        this.serviceType = serviceType;
        this.numberOfSits = numberOfSits;
        this.transportMode = transportMode;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public int getNumberOfSits() {
        return numberOfSits;
    }

    public void setNumberOfSits(int numberOfSits) {
        this.numberOfSits = numberOfSits;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public void carInfo(){
        System.out.println("This Car type is " + serviceType);
        System.out.println("This Car have " + numberOfSits + " number of sites");
        System.out.println("This Car used for " + transportMode + " transportation");
    }
}
