package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many numbers you want to enter! \r");
        System.out.println("The minimum value is " + findMin(readIntegers(scanner.nextInt())));
    }

    private static int[] readIntegers(int count){
        System.out.println("Please enter the integers!");
        int[] arrays = new int[count];
        for (int i = 0; i < count; i++){
            arrays[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return arrays;
    }

    private static int findMin(int[] array){
        int minimum = array[0];
        for (int i = 1; i < array.length; i++){
                if (array[i] < minimum){
                    minimum = array[i];
            }
        }
        return minimum;
    }
}
