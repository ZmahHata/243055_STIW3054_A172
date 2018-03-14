/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythreads;

/**
 *
 * @author User
 */
class MyThreads extends Thread {

    public void run() {
        System.out.println("running...new");
        System.out.println("Hye 243055");
    }

    public static void main(String args[]) {
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}
