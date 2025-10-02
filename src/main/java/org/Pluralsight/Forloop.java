package org.Pluralsight;

public class Forloop {
    public static void main (String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(10 - i);
            Thread.sleep(1000);
        }

        System.out.println("Launch!");
    }
}
