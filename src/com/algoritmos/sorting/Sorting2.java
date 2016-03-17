
package com.algoritmos.sorting;

import java.io.*;
import java.util.*;

public class Sorting2 {

    public static void insertionSortPart2(int[] arr)
    {
        // Fill up the code for the required logic here
        // Manipulate the array as required
        // The code for Input/Output is already provided

        for(int i=0 ; i< arr.length;i++){

            if(arr[i]>arr[i+1]){

                arr = exchange(arr,i);

                if(arr[i]<arr[i-1]){
                    arr = exchange(arr,i-1);
                }
            }

            printArray(arr);

        }

    }

    public static int[]exchange(int[]arr,int i){

        arr[i]= arr[i]^arr[i+1];
        arr[i+1]= arr[i]^arr[i+1];
        arr[i]= arr[i]^arr[i+1];
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}