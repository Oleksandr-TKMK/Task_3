package com.company;

import java.time.LocalDateTime;

public class MyRunnable1 implements Runnable { // Runnable class for Thread

    TSStack tsStack;

    public MyRunnable1(TSStack tsStack) {
        this.tsStack = tsStack;
    }  // Constructor

    @Override
    public void run() {  // Add to UserStack array of Box elements

        tsStack.addToStackAll(new Box[]{new Box<>(2.55), new Box<>("Some string"),
                new Box<>(2), new Box<>('Z'), new Box<>(true),
                new Box<>(LocalDateTime.now())});

    }
}
