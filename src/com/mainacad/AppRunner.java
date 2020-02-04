package com.mainacad;

import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;
import java.util.ArrayList;

public class AppRunner {

    public static void main(String[] args) {

        Square square1 = new Square(10);
        Square square2 = new Square(15);
        Square square3 = new Square(18);

        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(18);

        Triangle triangle1 = new Triangle(10, 12);
        Triangle triangle2 = new Triangle(12, 15);
        Triangle triangle3 = new Triangle(15, 18);

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(triangle3);

        Shape minShape = null;
        Shape maxShape = null;

        if (!shapes.isEmpty()) {
            maxShape = shapes.get(0);
            minShape= shapes.get(0);
        }

        for ( int i = 1; i < shapes.size(); i++) {

            if ( maxShape.getArea() < shapes.get(i).getArea()) {
                maxShape = shapes.get(i);
            }

            if ( minShape.getArea() > shapes.get(i).getArea()) {
                minShape = shapes.get(i);
            }
        }

        System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " with area " + maxShape.getArea() +
                " and min shape is " + minShape.getClass().getSimpleName() + " with area " + minShape.getArea());







    }
}
