package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = inputArray(5);
        int[] sortedArray = sortArray(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(sortedArray[i]);
        }
    }

    private static int[] inputArray(int number){
        System.out.println("Enter " + number + " integer \r");
        int[] values = new int[number];
        for (int i = 0; i < number; i++){
            values[i] = input.nextInt();
        }
        return values;
    }

    private static int[] sortArray(int[] array){
        int tem = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                if (array[j] >= array[i]){
                    tem = array[i];
                    array[i] = array[j];
                    array[j] = tem;
                }
            }
        }
        return array;
    }
}
