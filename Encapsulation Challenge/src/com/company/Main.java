package com.company;

class Movie{
private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }
    // No plot here
}

public class Main {

    public static void main(String[] args) {

        for (int i=1; i <11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + "\n" + ":" + movie.getName() +
                    "Plot:" + movie.plot() + "\n");
        }

//        Printer printer = new Printer(0, 1,true);
//        printer.fillToner(1000);
//        printer.printPage(2);
//        System.out.println("Printed number of pages is " + printer.getNumberOfPages());
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
                default:
                    return new Forgettable();
        }
    }
}
