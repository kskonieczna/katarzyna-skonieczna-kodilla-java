package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String getShapeName() {
        return "Circle";
    }

    public Double getField(Double r) {
        return r * r * 3.14;
    }
}