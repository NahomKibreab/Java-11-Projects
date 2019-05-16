package com.company;

public class Main {

    public static void main(String[] args) {
	BaseHamburger baseHamburger = new BaseHamburger("Hamburger", "Roll type", "meat",10);
	baseHamburger.additional(false,false,false,true);
	baseHamburger.createBurger();

    HealthyBurger healthyBurger = new HealthyBurger(true,true);
    healthyBurger.additional();
    healthyBurger.createBurger();

    DeluxBurger deluxBurger = new DeluxBurger();
    deluxBurger.additional();
    deluxBurger.createBurger();
    }

}
