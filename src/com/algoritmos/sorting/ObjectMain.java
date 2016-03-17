package com.algoritmos.sorting;

/**
 * Created by STO on 22/02/2016.
 */
public final class  ObjectMain {
    private static final ObjectMain ourInstance = new ObjectMain();

    private ObjectMain() {
    }

    public static ObjectMain getInstance() {


        synchronized (ObjectMain.class) {
            return ourInstance;
        }
    }


}
