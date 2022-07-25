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
public class daysOfWeek {
  
//3)	Write and test a method that given an integer from 1-7 (no need to validate), returns the name of the corresponding day (Monday, Tuesday...Sunday). 
    public static void main (String [] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("digite um numero de dia da semana: \n");
    	int day = sc.nextInt();
    	String dayWeek = null;
        dayWeek =  getDayOfWeek(day);
        //dayWeek = getDayOfWeek("1"); nao posso passar um parametro que nao seja do tipo especificado
 
        System.out.println("week Day:"+ dayWeek);
    }
    
    public static String getDayOfWeek(int dayNum){
    	
        switch (dayNum) {
             case 1:
                 return "Monday";
                 
             case 2:
                 return "Tuesday";
                
             case 3:
                 return "Wedneday";
                 
             case 4:
                 return "Thursday";
                 
             case 5:
                 return "Friday";
                 
             case 6:
                 return "Saturday";
                
             case 7:
                 return "Sunday";
                 
        }
                 return "Invalid";
    
          
    
         }
       
    // 4)	Write and test method that takes, as arguments, 3 integer values and returns the maximum of the three numbers.
    
    }
    
  






 