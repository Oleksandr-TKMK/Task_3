package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


class TSStackTest {
    private TSStack myStack;
    private Box box1;
    private Box box2;
    private Box box3;
    private Box box4;
    private Box box5;
    private Box box6;
    private LocalDateTime f;

    @BeforeEach
    void setUp() {
        box1 = new Box<>(2.55);
        box2 = new Box<>("Some string");
        box3 = new Box<>(2);
        box4 = new Box<>('Z');
        box5 = new Box<>(true);
        f =  LocalDateTime.now();
        box6 = new Box<>(f);
        myStack = new TSStack();
        myStack.addToStackAll(new Box[]{new Box<>(2.55), new Box<>("Some string"),
                new Box<>(2), new Box<>('Z'), new Box<>(true),
                new Box<>(f)});
    }


    @Test
    void getFromStack() {
        Assertions.assertEquals(box6.getElement(), myStack.getFromStack().getElement());
        Assertions.assertEquals(box5.getElement(), myStack.getFromStack().getElement());
        Assertions.assertEquals(box4.getElement(), myStack.getFromStack().getElement());
        Assertions.assertEquals(box3.getElement(), myStack.getFromStack().getElement());
        Assertions.assertEquals(box2.getElement(), myStack.getFromStack().getElement());
        Assertions.assertEquals(box1.getElement(), myStack.getFromStack().getElement());
    }
}