package com.codegym;

public class EvenThread implements Runnable {
    @Override
    public void run() {

        try {
            for (int i = 2; i < 10; i += 2) {
                System.out.println(i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

