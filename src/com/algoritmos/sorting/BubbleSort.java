package com.algoritmos.sorting;

/**
 * Created by STO on 22/02/2016.
 */
public class BubbleSort {


  private int[] numbers;


    public void bubbleSort(int[] arr){

        this.numbers = arr;
        boolean swapped = true;
        int j =0;
        int tmp;
        while(swapped){
            swapped = false;
            j++;
            for(int i =0; i< numbers.length -j;i++){
                if(numbers[i]> numbers[i + 1]){
                    tmp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i +1] = tmp;
                    swapped = true;
                }
            }
        }

    }
}
