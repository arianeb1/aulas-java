/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequiel.aulas.aula03;

import java.util.Random;

/**
 *
 * @author ezequ
 */
public class ConficionalForVetor {
    public static void main(String[] args) {
         String nomes[] = {"Juca Bala", "Maria da Silva", "Marcos Paqueta"};
         for(String nome : nomes ){
             System.out.println("Nome :"+ nome);
         }
         
         int [] itens = new int [10];
         for(int cont = 0; cont < itens.length; cont++){
             Random rn = new Random();
             int i = rn.nextInt();
             itens[cont] = i;
         }
         
         for(int value : itens){
             System.out.println(value);
         }
         
         for(int cont = 0; cont < itens.length; cont ++){
             System.out.println("valor: "+ itens[cont]);
         }
         
        // System.out.println("Esta linha nao funciona pois estou tentando pegar uma posicao inexistente"+ nomes [5] );
        
        
        
    }
}
