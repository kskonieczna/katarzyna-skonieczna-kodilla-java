package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapeList = new ArrayList<>();

    public ShapeCollector() {
        this.shapeList = shapeList;
    }

    public ArrayList<Shape> addFigure(Shape shape, ArrayList<Shape> shapeList) {
        shapeList.add(shape);

        return shapeList;
    }

    public ArrayList<Shape> removeFigure(Shape shape, ArrayList<Shape> shapeList) {
        shapeList.remove(shape);

        return shapeList;
    }

    public Shape getFigure(int n, ArrayList<Shape> shapeList) {

        return shapeList.get(n);
    }

    public ArrayList<Shape> showFigures(ArrayList<Shape> shapeList) {

        return shapeList;
    }
}