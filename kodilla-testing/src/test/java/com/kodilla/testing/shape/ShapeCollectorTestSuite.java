package com.kodilla.testing.shape;

import org.junit.*;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @Before
    public void before() {
        testCounter++;
        System.out.println("Test Case #"+ testCounter + ": begin");
    }

    @After
    public void after() {
        System.out.println("Test Case #"+ testCounter + ": finished");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: All tests are finished");
    }

    @Test
    public void should_add_figure_to_list() {
        //Given
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        ArrayList<Shape> figureList = new ArrayList<Shape>(){{
            add(circle);
            add(triangle);
        }};
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        ArrayList<Shape> temporary =  new ArrayList<Shape>(){{
           add(circle);
        }};
        ArrayList<Shape> result = shapeCollector.addFigure(triangle, temporary);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(figureList, result);
    }

    @Test
    public void should_remove_figure_from_list() {
        //Given
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        ArrayList<Shape> figureList = new ArrayList<Shape>(){{
            add(circle);
            add(triangle);
            remove(circle);
        }};
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        ArrayList<Shape> temporary = new ArrayList<Shape>(){{
           add(circle);
           add(triangle);
        }};
        ArrayList<Shape> result = shapeCollector.removeFigure(circle, temporary);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(figureList, result);
    }

    @Test
    public void should_get_figure_with_given_index() {
        //Given
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        ArrayList<Shape> figureList = new ArrayList<Shape>(){{
            add(circle);
            add(triangle);
        }};
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        ArrayList<Shape> temporary = new ArrayList<Shape>(){{
            add(circle);
            add(triangle);
        }};
        Shape result = shapeCollector.getFigure(1, temporary);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(figureList.get(1), result);
    }

    @Test
    public void should_show_all_figures_listed() {
        //Given
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        ArrayList<Shape> figureList = new ArrayList<Shape>(){{
            add(circle);
            add(triangle);
            add(square);
        }};
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        ArrayList<Shape> temporary = new ArrayList<Shape>(){{
            add(circle);
            add(triangle);
            add(square);
        }};
        ArrayList<Shape> result = shapeCollector.showFigures(temporary);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(figureList, result);
    }
}