package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public String getShapeName() {
        return "Square";
    }

    public Double getField(Double r) {
        return Math.sqrt(3)/4*r*r;
    }
}