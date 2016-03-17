package com.algoritmos.sorting;

/**
 * Created by STO on 24/02/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]){


        Scanner sc=new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        sortArray(arr);

    }

    private static void sortArray(int[] arr) {


        for(int i=0; i<arr.length;i++){

            int len = arr.length -1;
            int var = arr[i];
        while(len>0){

            if(arr[len-1]>var){
                arr[len]= arr[len-1];


                arr[len-1]=var;
            }
            len--;

        }
        for(int j=0;j<arr.length;j++) {
            System.out.print(arr[j] + " ");


        }
            System.out.println( " ");
        }
    }





}

