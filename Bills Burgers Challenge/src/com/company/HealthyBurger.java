package com.company;

public class HealthyBurger extends BaseHamburger {
    boolean salad;
    boolean chips;
    public HealthyBurger(boolean salad, boolean chips) {
        super("Healthy Burger", "Brown rye Bread Roll", "meat", 15);
        this.salad = salad;
        this.chips = chips;
    }

    public void additional() {
        super.additional(true, true, true, true);
        if (salad){
            setAdditionals(getAdditionals() + "Salad, ");
            setTotalPrice(getTotalPrice() + addItem());
        }

        if (chips){
            setAdditionals(getAdditionals() + "Chips, ");
            setTotalPrice(getTotalPrice() + addItem());
        }
    }

    @Override
    public void createBurger() {
        System.out.println("Your order for Basic Hamburger \n"
                + "Healthy Hamburger Price -> " + 15 + "$ \n" +
                "Additionals : " + getAdditionals() + "\nTotal Price ->"
                + (getTotalPrice() + getPrice())
                + "\n*******************************\n");
    }
}
