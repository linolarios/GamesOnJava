package com.algoritmos.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by STO on 22/02/2016.
 */
public class TestMerge {


    private static int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 80;

    public static void setUp() throws Exception {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }


    public static void main(String args[]) throws Exception {

        setUp();


        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(" " + numbers[i] );

        }
        System.out.print(" "  );
        long startTime = System.currentTimeMillis();
        Arrays.sort(numbers);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Standard Java sort " + elapsedTime);

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("Number " + numbers[i]);

            if (numbers[i] > numbers[i + 1]) {
                System.out.println("Should not happen");
            }
        }

    }



}

