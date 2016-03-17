package com.algoritmos.sorting;

/**
 * Created by STO on 22/02/2016.
 */
public class QuickSort {


    private int numbers[];
    private int number;

    public void sort(int[] values){

        if(values == null || values.length ==0){

            return;
        }
        this.numbers = values;
        number = values.length;
        quickSort(0,number - 1);
    }

    private void quickSort(int low, int high) {

        System.out.println("low : "+low+ " high : "+ high);

        int i= low, j = high;

        int pivot = numbers[low + (high-low)/2];

        while(i<=j){
            while(numbers[i] <pivot){
                i++;
            }
            while(numbers[j]>pivot){
                j--;
            }
            if(i<=j){
                exchange(i,j);
                i++;
                j--;
            }
        }
        if(low < j)
            quickSort(low,j);
        if(i<high)
            quickSort(i,high);
    }

    private void exchange(int i, int j) {

        System.out.println("before "+numbers[i]+" : "+numbers[j]);
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;


        System.out.println(" after "+numbers[i]+" : "+numbers[j]);

    }


}
