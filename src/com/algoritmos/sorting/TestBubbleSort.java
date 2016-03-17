package com.algoritmos.sorting;

import java.util.Random;

/**
 * Created by STO on 22/02/2016.
 */
public class TestBubbleSort {

    private static int[] numbers ;
    private final static int SIZE = 7;
    private  final static int MAX = 80;

    public static void setUp() throws Exception {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }

    public static void main(String args[]) throws Exception {

             BubbleSort sorter = new BubbleSort();


        setUp();
        printResult(numbers);

        sorter.bubbleSort(numbers);
        if (!validate(numbers)) {
            System.out.println("Should not happen");
        }
        printResult(numbers);

    }


    private static boolean validate(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void printResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" "+numbers[i]);
        }
        System.out.println();
    }
}
