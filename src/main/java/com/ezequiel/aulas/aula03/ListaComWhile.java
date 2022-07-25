/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequiel.aulas.aula03;

/**
 *
 * @author ezequ
 */
public class ListaComWhile {
    public static void main(String[] args) {
        String nomes[] = {"Juca Bala", "Maria da Silva", "Marcos Paqueta"};
        int cont = 0;
        while(cont < nomes.length){
            System.out.println("Nome: "+ nomes[cont]);
            cont++;
        }
    }
}
