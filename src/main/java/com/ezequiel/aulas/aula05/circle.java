/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ezequiel.aulas.aula05;

import java.util.Scanner;

/**
 *
 * @author Ariane
 */
public class circle {
    
    //1)	Write and test method that calculates and returns the area of a circle, given the radius as argument. (Area =π r2)
    
    public static double circleArea (double radius)
    {
    
       return Math.PI * radius *radius;
    }
    
 public static void main (String[]args)  {
 
     Scanner in = new Scanner (System.in);
    
     System.out.println("Enter circle radius");
     double radius = in.nextDouble();
     double area = circleArea(radius);
     System.out.println("The area of circle is " + area);
     
     
     
     
     
     
 }
}
