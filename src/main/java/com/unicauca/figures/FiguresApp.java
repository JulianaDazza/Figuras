/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unicauca.figures;

import com.unicauca.figures.domain.models.Circle;
import com.unicauca.figures.domain.models.Figure;
import com.unicauca.figures.domain.models.Square;
import com.unicauca.figures.domain.models.Triangle;
import com.unicauca.figures.domain.presentation.GUICircle;
import com.unicauca.figures.domain.presentation.GUISquare;
import com.unicauca.figures.domain.presentation.GUITriangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author libardo
 */
public class FiguresApp {

    public static void main(String[] args) {
        
        
        int option;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("\t MENU");
        System.out.println("-------------------------");
        System.out.println("\t 1. Circulo");
        System.out.println("\t 2. Triangulo");
        System.out.println("\t 3. Cuadrado");
        System.out.println("-------------------------");
        option = read.nextInt();
        
        switch(option){
            case 1:
                GUICircle guiCircle = new GUICircle();
                guiCircle.setSize(500, 400);
                guiCircle.setVisible(true);
                break;
            case 2:
                GUITriangle guiTriangle = new GUITriangle();
                guiTriangle.setSize(500, 400);
                guiTriangle.setVisible(true);
                break;
            case 3:
                GUISquare guiSquare = new GUISquare();
                guiSquare.setSize(500, 400);
                guiSquare.setVisible(true);
                break;
            default:
                System.out.println("OPCION NO VALIDA");
                break;
        }
        /*Figure fig = new Circle(1.3);
        Figure fig2 = new Triangle(5.2, 1.4,12,3);
        Figure fig3 = new Square(4.6);
        
        List<Figure> figures = new ArrayList<>();
        figures.add(fig);
        figures.add(fig2);
        figures.add(fig3);
        
        for(Figure figure: figures){
            System.out.println("Area: " + figure.calculateArea());
            System.out.println("Perimeter: " + figure.calculatePerimeter());
        }*/
    }
}
