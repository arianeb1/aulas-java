/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequiel.aulas.aula03;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author ezequ
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    /*
    int opcao = 0;

    do {
      System.out.println("Escolha uma opcao:");
      System.out.println("1 - Iniciar jogo");
      System.out.println("2 - Ajuda");
      System.out.println("3 - Sair");
      System.out.println("OPCAO: ");
      opcao = entrada.nextInt();
    } while (opcao != 3);
*/
    int contador = 6;
    do{
        System.out.println("contador"+ contador);
        contador++;
    }while(contador <= 5);
  }
}

