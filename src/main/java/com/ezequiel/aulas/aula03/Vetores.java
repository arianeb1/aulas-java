/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequiel.aulas.aula03;

/**
 *
 * @author ezequ
 */
public class Vetores {
    public static void main(String[] args) {
        String [] compras = new String [10];
        compras[0] = "Arroz";
        compras[1] = "Feijao";
        compras[7] = "Açucar";
        compras[9] = "farinha";
        
        System.out.println("primeira posicao é sempre 0 "+ compras[0]);
        System.out.println("ultima posicao é a 9 neste caso "+ compras[9]);
         
        compras[0] = "detergente";
        System.out.println("trocado o elemento da posicao 0 "+ compras[0]);
        
        System.out.println("elemento null na posicao 2 "+ compras[2]);
        
        int intens [] = new int[5];
        
        System.out.println("ultima posicao é a 9 neste caso "+ compras[9]);
        
        String nome[] = {"Juca Bala", "Maria da Silva", "Marcos Paqueta"};
        
        int vetorInt [] = {1,2,3};
        
        System.out.println("tamanho do vator: "+ nome.length);
        
    }
}
