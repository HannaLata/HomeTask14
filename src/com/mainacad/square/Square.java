package com.mainacad.square;

import com.mainacad.abs.AbstractShape;

public class Square extends AbstractShape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }

    public String toString () {
        return String.valueOf(side*side);
    }
}
