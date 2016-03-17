package com.algoritmos.sorting;

/**
 * Created by STO on 24/02/2016.
 */
public enum Singleton {


    INSTANCE;

    public void distributePresents(){

        System.out.println("Ho Ho Ho ");
    }


    public static void main(String args[]){
        Singleton fatGuy = Singleton.INSTANCE;
        fatGuy.distributePresents();
    }
}
