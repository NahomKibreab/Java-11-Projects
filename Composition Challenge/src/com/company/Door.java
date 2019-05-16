package com.company;

public class Door {
    private int width;
    private int height;

    public Door(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void openDoor(){
        System.out.println("Door opened!");
    }

    public void closeDoor(){
        System.out.println("Door closed!");
    }
}
