package com.problems;

/**
 * Created by STO on 02/03/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         String[] words = new String[n];
        for(int i =0; i<n; i++){
            words[i] = scan.next();

        }

        for(int i =0; i<words.length;i++){

            System.out.println(funny(words[i]));
        }


    }

    public static String funny(String word){

        char []s = word.toCharArray();
        char []r = new StringBuffer(word).reverse().toString().toCharArray();
        System.out.println(s);
        System.out.println(r);
        int n = s.length;
        for(int i=1,j=0;i<n;i++,j++){
            int tmp1 = s[i]-s[j];
            int tmp2 =  r[i]-r[j];
            if(Math.abs(tmp1) != Math.abs(tmp2) ){
                return "Not funny";
            }
        }
        return "Funny";
    }
}