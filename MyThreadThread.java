/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysleep;

/**
 *
 * @author master lab
 */
public class MyThreadThread extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            for (int x = 1000; x <= 1010; x++) {
                System.out.println(x);
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
