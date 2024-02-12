package com.unicauca.figures.domain.models;

/**
 *
 * @author JUAN DAVID
 */
public class Square extends Figure{

    private double side; 
    
    public Square(double lado){
        this.side = lado;
    }
    @Override
    public double calculateArea() {
       return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
}
