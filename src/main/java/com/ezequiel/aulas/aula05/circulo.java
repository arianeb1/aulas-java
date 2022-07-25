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
public class circulo {
	
 public static void main (String [ ]args){
 
 double area = areaCicle ();
 System.out.println(num);
 System.out.println("O valor da area e = " + area);   
 
 }   
 
 public static double areaCicle (){
 
     
 Scanner kb = new Scanner (System.in);
 double PI = 3.1415;
 double raio;
 
     System.out.println("Digite o raio de um circulo");
     raio = kb.nextDouble();
     
 double area = raio * raio * PI;
    
    
    return area;
 
 }
 
 
 static int num = 10;
 
}
