package com.company;

import java.time.LocalDateTime;

public class MyRunnable2 implements Runnable { // Runnable class for Thread

    TSStack tsStack;

    public MyRunnable2(TSStack tsStack) {
        this.tsStack = tsStack;
    } // Constructor

    @Override
    public void run() { // Add to UserStack array of Box elements

        tsStack.addToStackAll(new Box[]{new Box<>(3.55), new Box<>("Another Some string"),
                new Box<>(3), new Box<>('W'), new Box<>(false),
                new Box<>(LocalDateTime.now().toLocalDate())});
    }
}
