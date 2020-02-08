package com.mainacad.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testGetArea() {
        Square square = new Square(20);
        assertEquals(400, square.getArea());
    }

    @Test
    void testToString() {
        Square square = new Square(10);
        String expected = "100.0";
        assertEquals(expected, square.toString());
    }
}