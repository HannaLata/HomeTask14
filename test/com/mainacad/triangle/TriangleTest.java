package com.mainacad.triangle;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testGetArea() {
        Triangle triangle = new Triangle(20, 12);
        assertEquals(120, triangle.getArea());
    }

    @Test
    void testToString() {
        Triangle triangle = new Triangle(10, 12);
        assertEquals("60.0", triangle.toString());
    }
}