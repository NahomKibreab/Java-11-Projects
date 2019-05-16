package com.company;

public class Television {

    private String name;
    private String model;
    private Dimensions dimensions;

    public Television(String name, String model, Dimensions dimensions) {
        this.name = name;
        this.model = model;
        this.dimensions = dimensions;
    }

    public void turnOn(boolean power){
        Eletric eletric = new Eletric(power);
        if (eletric.isPower()){
            System.out.println("Tv is on!");
        } else {
            System.out.println("Tv can not turned on b/c there's no power");
        }
    }

    public void powerOff(){
        System.out.println("Tv is Off!");
    }
}
