package com.algoritmos.sorting;

/**
 * Created by STO on 22/02/2016.
 */
public class TestSingleton {





    public static void main(String args[]){

        ObjectMain n= ObjectMain.getInstance();
        ObjectMain n2 = ObjectMain.getInstance();


        System.out.println(n);

        System.out.println(n2);
    }
}
