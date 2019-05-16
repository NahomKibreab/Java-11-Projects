package com.company;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    VipCustomer(){
        this.name = "Nahom";
        this.creditLimit = 12;
        this.email = "nknahom@gmail.com";
    }

    VipCustomer(String name, int crediLimit){
        this.name = name;
        this.creditLimit = crediLimit;
        this.email = "nknahom@gmail.com";
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
