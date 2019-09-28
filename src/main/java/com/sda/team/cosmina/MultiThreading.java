package com.sda.team.cosmina;

public class MultiThreading {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("running");
        Thread worker = new Thread(task);
        worker.start();

        // anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, runnable");
            }
        };

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
