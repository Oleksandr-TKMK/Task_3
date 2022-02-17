package com.company;

public class Box<T> { //class with generic type

    private T element; // variable may be different types for different Box<T>

    public Box(T element) {  //class constructor

        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
