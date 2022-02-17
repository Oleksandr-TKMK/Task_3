package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BoxTest {

    @Test
    void getElement() {
        Box<Integer> box = new Box<>(2);
        Box<String> box1 = new Box<>("Something");
        int x = 2;
        int y = box.getElement();
        String text = "Something";
        String text1 = box1.getElement();
        Assertions.assertEquals(x, y);
        Assertions.assertEquals(text, text1);

    }
}