package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread thread1 = new Thread(new EvenThread());
        Thread thread2 = new Thread(new OddThread());


        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
