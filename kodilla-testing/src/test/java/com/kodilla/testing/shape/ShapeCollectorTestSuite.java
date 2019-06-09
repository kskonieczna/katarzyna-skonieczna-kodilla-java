package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector shapeCollector = new ShapeCollector();

    @Before
    public void before() {
        testCounter++;
        System.out.println("Test Case #" + testCounter + ": begin");
    }

    @After
    public void after() {
        System.out.println("Test Case #" + testCounter + ": finished");
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
        ArrayList<Shape> expected = new ArrayList<Shape>() {{
            add(circle);
            add(triangle);
        }};
        //When
        ArrayList<Shape> preparedShapeList = new ArrayList<Shape>() {{
            add(circle);
        }};
        ArrayList<Shape> actual = shapeCollector.addFigure(triangle, preparedShapeList);
        System.out.println("Testing " + actual);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_remove_figure_from_list() {
        //Given
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        ArrayList<Shape> expected = new ArrayList<Shape>() {{
            add(triangle);
        }};
        //When
        ArrayList<Shape> preparedShapeList = new ArrayList<Shape>() {{
            add(triangle);
            add(circle);
        }};
        ArrayList<Shape> actual = shapeCollector.removeFigure(circle, preparedShapeList);
        System.out.println("Testing " + actual);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_get_figure_with_given_index() {
        //Given
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Shape expected = triangle;
        //When
        ArrayList<Shape> preparedList = new ArrayList<Shape>() {{
            add(circle);
            add(triangle);
        }};
        Shape actual = shapeCollector.getFigure(1, preparedList);
        System.out.println("Testing " + actual);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_show_all_figures_listed() {
        //Given
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        ArrayList<Shape> expected = new ArrayList<Shape>() {{
            add(circle);
            add(triangle);
            add(square);
        }};
        //When
        ArrayList<Shape> preparedList = new ArrayList<Shape>() {{
            add(circle);
            add(triangle);
            add(square);
        }};
        ArrayList<Shape> actual = shapeCollector.showFigures(preparedList);
        System.out.println("Testing " + actual);
        //Then
        Assert.assertEquals(expected, actual);
    }
}