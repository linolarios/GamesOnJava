package com.algoritmos.sorting;

import java.util.*;

/**
 * Created by STO on 23/02/2016.
 */
public class FirstUnique {

    public static char firstUniqueChar(String word){



        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!word.matches("(.*)" + letter + "(.*)" + letter + "(.*)")) {
                return letter;
            }
        }
        return ' ';


    }

    public static int firstUniqueNumber(int[] number){

        List<Integer> repeating = new ArrayList<>();
        List<Integer> nonRepeating = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {

            int letter = number[i];
            System.out.println(i + " - "+ letter );
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                System.out.println("removing "+letter);

                System.out.println("size "+nonRepeating.size());
                System.out.println("index of  "+nonRepeating.indexOf(letter));

                nonRepeating.remove((Object)letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);




    }






    public static void main(String args[]){

        List list = new LinkedList();

        System.out.println(firstUniqueChar("abcdefghija"));
        System.out.println( firstUniqueNumber(new int[]{1,2,3,1,3,4,5,6}));
    }

}
