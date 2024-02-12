package com.unicauca.figures.domain.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Libardo
 */
public class CircleTest {

    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double radius = 1;
        Circle instance = new Circle(radius);
        double areaExpected = Math.PI * Math.pow(radius, 2);
        double areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.01);

        radius = 523.8;
        instance.setRadius(radius);
        areaExpected = Math.PI * Math.pow(radius, 2);
        areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.01);
        
        radius = 456330;
        instance.setRadius(radius);
        areaExpected = Math.PI * Math.pow(radius, 2);
        areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.01);
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double radius = 1;
        Circle instance = new Circle(radius);
        double perimeterExpected = 2.0 * Math.PI * radius;
        double perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.01);

        radius = 133.45;
        instance = new Circle(radius);
        perimeterExpected = 2.0 * Math.PI * radius;
        perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.01);
        
        radius = 112003.5;
        instance = new Circle(radius);
        perimeterExpected = 2.0 * Math.PI * radius;
        perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.01);

    }

}
