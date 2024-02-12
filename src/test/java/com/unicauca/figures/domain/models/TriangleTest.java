/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.figures.domain.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ACER
 */
public class TriangleTest {
    
    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double base = 12;
        double altura = 20;
        double ladoIzq = 15;
        double ladoDer = 15;
        Triangle instance = new Triangle(base, altura, ladoIzq, ladoDer);
        double areaExpected = (base*altura)/2;
        double areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.01);

        base = 60;
        altura = 102;
        ladoIzq = 80;
        ladoDer = 45;
        instance = new Triangle(base, altura, ladoIzq, ladoDer);
        areaExpected = (base*altura)/2;
        areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.01);
        
        base = 2500;
        altura = 4258;
        ladoIzq = 1045;
        ladoDer = 3246;
        instance = new Triangle(base, altura, ladoIzq, ladoDer);
        areaExpected = (base*altura)/2;
        areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.01);
    }
    
    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculateArea");
        double base = 12;
        double altura = 20;
        double ladoIzq = 15;
        double ladoDer = 15;
        Triangle instance = new Triangle(base, altura, ladoIzq, ladoDer);
        double perimeterExpected = base + ladoIzq + ladoDer;
        double perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.01);

        base = 60;
        altura = 102;
        ladoIzq = 80;
        ladoDer = 45;
        instance = new Triangle(base, altura, ladoIzq, ladoDer);
        perimeterExpected = base + ladoIzq + ladoDer;
        perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.01);
        
        base = 2500;
        altura = 4258;
        ladoIzq = 1045;
        ladoDer = 3246;
        instance = new Triangle(base, altura, ladoIzq, ladoDer);
        perimeterExpected = base + ladoIzq + ladoDer;
        perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.01);
    }
}
