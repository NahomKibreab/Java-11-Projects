package com.company;

public class DeluxBurger extends BaseHamburger{
    public DeluxBurger() {
        super("Delux Burger", "Roll Type", "meat", 13);
    }

    public void additional() {
        super.additional(true, true, true, true);
        setAdditionals(getAdditionals() + "Chips, ");
        setTotalPrice(getTotalPrice() + addItem());

        setAdditionals(getAdditionals() + "Driks, ");
        setTotalPrice(getTotalPrice() + addItem());
    }

    @Override
    public void createBurger() {
        System.out.println("Deluxe Hamburger Price -> " + getPrice() + "$ \n" +
                "Additionals : " + getAdditionals() + "\nTotal Price ->"
                + (getTotalPrice() + getPrice())
                + "\n*******************************\n");
    }
}
