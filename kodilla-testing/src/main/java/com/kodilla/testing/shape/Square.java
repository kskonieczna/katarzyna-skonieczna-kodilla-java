package com.kodilla.testing.shape;

public class Square implements Shape {

    public String getShapeName() {
        return "Square";
    }

    public Double getField(Double r) {
        return r * r;
    }
}