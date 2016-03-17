package com.thrad.concurrency;

/**
 * Created by STO on 22/02/2016.
 */
public class Test {


    public synchronized void m1() {
        try {

            Thread.sleep(2000);
            this.wait();
        }
        catch (InterruptedException ie) {}
    }

    public synchronized void m2() {
        try { Thread.sleep(2000);

        this.notify();}
        catch (InterruptedException ie) {}
    }

    public static void main(String[] args) throws InterruptedException {
        final Test t = new Test();
        Thread t1 = new Thread() { public void run() { t.m1(); } };
        Thread t2 = new Thread() { public void run() { t.m2(); } };

        t1.start();
        Thread.sleep(500);
        System.out.println(t1.getState());

        t2.start();
        Thread.sleep(500);

        System.out.println(t2.getState());

        System.out.println(t1.getState());

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
