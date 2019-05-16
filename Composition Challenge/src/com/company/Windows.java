package com.company;

public class Windows {
    private int width;
    private int height;

    public Windows(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private void openWindows(){
        System.out.println("Windows opened!");
    }

    private void closedWindows(){
        System.out.println("Windows closed!");
    }
}
