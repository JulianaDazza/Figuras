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
public class SquareTest {
    
    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double side = 15;
        Square instance = new Square(side);
        double areaExpected = side*side;
        double areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.01);

        side = 523.8;
        instance.setSide(side);
        areaExpected = side*side;
        areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.01);
        
        side = 456330;
        instance.setSide(side);
        areaExpected = side*side;
        areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.01);
    }
    
    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double side = 15;
        Square instance = new Square(side);
        double perimeterExpected = 4*side;
        double perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.01);

        side = 523.8;
        instance.setSide(side);
        perimeterExpected = 4*side;
        perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.01);
        
        side = 456330;
        instance.setSide(side);
        perimeterExpected = 4*side;
        perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.01);
    }

}
