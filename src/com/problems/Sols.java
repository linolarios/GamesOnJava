package com.problems;

import java.util.*;

/**
 * Created by STO on 03/03/2016.
 */
public class Sols {


    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();

        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        Map map = new HashMap<String,Integer>();
        int odd=0;
        for(int i=0; i<inputString.length();i++){
            String key =new String(inputString.charAt(i)+"");

            if(map.containsKey(key)){
                Integer value = (Integer)map.get(key) + 1;
                map.put(key,value);
            }else{
                map.put(key,1);
            }
        }

        Iterator it = map.entrySet().iterator();

               while (it.hasNext()){
                   Map.Entry pair = (Map.Entry)it.next();
            if((Integer)pair.getValue()%2>0){
                odd++;
            }

                   it.remove();
        }


        ans = odd>1 ?"NO":"YES";

        System.out.println(ans);
        myScan.close();
    }
}
