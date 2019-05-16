package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer("Nahom",7);
        VipCustomer vipCustomer1 = new VipCustomer();
        VipCustomer vipCustomer2 = new VipCustomer("Nahom",7,"nknahom@gmail.com");
        System.out.println(vipCustomer.name + " = " + vipCustomer.email);
        System.out.println(vipCustomer1.name + " = " + vipCustomer1.email);
        System.out.println(vipCustomer2.name +  " = " + vipCustomer2.email);
    }
}
