package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Eletric eletric = new Eletric(false);

        Door door = new Door(5,12);
        Windows windows = new Windows(2,1);

        Dimensions dimensions = new Dimensions(10,7);
        Television television = new Television("LG", "ABC", dimensions);

        Room room = new Room(door,windows,television,eletric);
        room.turnOnTv();
    }
}
