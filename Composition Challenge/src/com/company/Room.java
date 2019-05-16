package com.company;

public class Room {
    private Door door;
    private Windows windows;
    private Television television;
    private Eletric eletric;
    private boolean power;

    public Room(Door door, Windows windows, Television television, Eletric eletric) {
        this.door = door;
        this.windows = windows;
        this.television = television;
        this.eletric = eletric;
    }

    public void powerOn(boolean power){
        this.power = power;
        eletric.powerOn(power);
    }

    public void turnOnTv(){
        television.turnOn(power);
    }
}
