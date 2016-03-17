package com.problems;

/**
 * Created by STO on 08/03/2016.
 */



    import java.io.*;
    import java.lang.reflect.*;
    import java.util.*;
    import java.util.regex.*;
    import java.security.*;


    public class Solution3 {

        public static void main(String[] args) throws Exception {
            Do_Not_Terminate.forbidExit();

            try{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int num=Integer.parseInt(br.readLine().trim());
                Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private


                o=Class.forName("Solution3$Inner");

                    Method m =   o.getClass().getDeclaredMethod("powerof2");

                m.setAccessible(true);
                String r = (String) m.invoke(num);
                System.out.println(r);

    System.out.println("An instance of class: "+o.getClass().getCanonicalName()+" has been created");

}//end of try

catch (Do_Not_Terminate.ExitTrappedException e) {
        System.out.println("Unsuccessful Termination!!");
        }
        }//end of main
static class Inner
{
    private class Private{
        private String powerof2(int num)
        {
            return ((num&num-1)==0)?"power of 2":"not a power of 2";
        }
    }
}//end of Inner

}//end of Solution

class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}




