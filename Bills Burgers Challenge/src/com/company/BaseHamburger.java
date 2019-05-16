package com.company;

public class BaseHamburger {
    private String name;
    private String bread;
    private String meat;
    private int price;
    private static int ADD_PRICE = 2;
    private int totalPrice = 0;
    private String additionals = "";

    public BaseHamburger(String name, String bread, String meat, int price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        if (price <= 0){
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    public void additional(boolean lettuce, boolean tomato, boolean carrot, boolean chilly){
        if (lettuce){
            additionals += "Lettuce, ";
            totalPrice += addItem();
        }

        if (tomato){
            additionals += "Tomato, ";
            totalPrice += addItem();
        }

        if (carrot){
            additionals += "Carrot, ";
            totalPrice += addItem();
        }

        if (chilly){
            additionals += "Chilly, ";
            totalPrice += addItem();
        }
    }

    public int addItem() {
        return 2;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAdditionals() {
        return additionals;
    }

    public void setAdditionals(String additionals) {
        this.additionals = additionals;
    }

    public void createBurger(){
        System.out.println("Your order for Basic Hamburger \n"
        + "Basic Hamburger Price -> " + price + "$ \n" +
                "Additionals : " + additionals + "\nTotal Price ->"
                + (totalPrice + price)
                + "\n*******************************\n");
    }
}
