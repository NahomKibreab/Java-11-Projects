package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
        if (tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }

        if (numberOfPages >= 0){
            this.numberOfPages = numberOfPages;
        }
        this.isDuplex = isDuplex;
    }

    public void fillToner(int toner){
        if (toner >= 0 && toner <= 100){
            if ((this.tonerLevel + toner) <= 100){
                this.tonerLevel = this.tonerLevel + toner;
                System.out.println("Printer toner level is " + this.tonerLevel + "%");
            } else if ((this.tonerLevel + toner) > 100){
                this.tonerLevel = 100;
                System.out.println("Printer toner level is " + this.tonerLevel + "%");
            } else {
                System.out.println("Printer toner is full! 100%");
            }
        } else if (toner > 100){
            System.out.println("Error : Maximum level Printer toner can receive is 100!");
        }
    }

    public int printPage(int page){
        if (page >= 0){
            this.numberOfPages = numberOfPages + page;
            return this.numberOfPages;
        } else {
            System.out.println("Error: Printer can not print!");
            return this.numberOfPages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
