package com.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by STO on 03/03/2016.
 */
public class Solsticio {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        final int SIZE =scan.nextInt();

        String[] arrayS = new String[SIZE];

        for(int i=0; i<SIZE; i++){

            arrayS[i] = scan.next();
        }
        int counter =0;
        char[] chars = arrayS[0].toCharArray();
        Arrays.sort(chars);

        String cadenai = new String(chars).replaceAll("(.)\\1{1,}", "$1");;

        System.out.println(cadenai);

        for(int i=0; i<cadenai.length();i++){
            int innerCounter =1;
            for(int j=1; j<arrayS.length;j++){

                 if(arrayS[j].contains(cadenai.charAt(i)+"")){
                     innerCounter++;
                 }

            }

            if(innerCounter%arrayS.length==0){
                counter++;
            }
        }

        System.out.println(counter);


    }
}
