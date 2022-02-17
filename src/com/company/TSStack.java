package com.company;

import java.util.Stack;

public class TSStack { // Clas for UserStack

    private Stack<Box> myStack = new Stack<>(); //Stack of <Box> elements


    public synchronized void addToStackAll(com.company.Box[] element) { // add to Stack array of Boxes
        for (int i = 0; i < element.length; i++)
            myStack.push(element[i]);
    }


    public synchronized Box getFromStack() {
        return myStack.pop();
    } // get 1 element from Stack

    public synchronized void getAllStack() { // get all elements from Stack and show they
        while (!myStack.empty())
            System.out.println(getFromStack().getElement());
    }


}



