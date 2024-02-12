package com.unicauca.figures.domain.models;

/**
 *
 * @author JUAN DAVID
 */
public class Triangle extends Figure{

    private double base, height, sideL,sideR;
    
     public Triangle(double base, double altura,double ladoIzq,double ladoDer){
        this.base = base;
        this.height = altura;
        this.sideL = ladoIzq;
        this.sideR = ladoDer;
    }
        
    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public double calculatePerimeter() {
        return base+sideL+sideR;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideL() {
        return sideL;
    }

    public void setSideL(double sideL) {
        this.sideL = sideL;
    }

    public double getSideR() {
        return sideR;
    }

    public void setSideR(double sideR) {
        this.sideR = sideR;
    }
    
}
