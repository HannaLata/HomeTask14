package com.mainacad.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void testGetArea() {
        Circle circle = new Circle(5);
        assertEquals(78.5398, circle.getArea(), 0.0001);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(10);
        assertEquals("314.1592653589793", circle.toString());

    }
}