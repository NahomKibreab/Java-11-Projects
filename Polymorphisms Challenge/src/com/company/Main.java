package com.company;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName() + " -> " + "Engine started!");
    }

    public void accelerate(int speed){
        System.out.println("Car accelerated by " + speed);
    }

    public void brake(){
        System.out.println("Brake was called!");
    }
}

class Bus extends Car{
    public Bus(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(super.getName() + " start engine");
    }
}

class MotorBike extends Car{
    public MotorBike(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(super.getName() + " start engine");
    }
}

class JetPlane extends Car{
    public JetPlane(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(super.getName() + " start engine");
    }
}

public class Main {

    public static void main(String[] args) {
	 Car car = new Car("JetPlane",3500);
        car.startEngine();

	 Car ford = new Car("Falcon", 12) {
         @Override
         public void startEngine() {
             System.out.println(super.getName() + " start engine");
         }
     };
        ford.startEngine();
    }
}
