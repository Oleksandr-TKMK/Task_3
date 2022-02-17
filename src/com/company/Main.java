package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        TSStack myStack = new TSStack(); // UserStack

        Thread myThread1 = new Thread(new MyRunnable1(myStack)); // Tread1 and Tread2 realize MyRunnable1, MyRunnable2
        Thread myThread2 = new Thread(new MyRunnable2(myStack));

        myThread1.start();
        myThread1.join();
        myThread2.start();
        myThread2.join();
        myStack.getAllStack();
    }
}
